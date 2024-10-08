package org.codegym.springboot.controller;

import org.codegym.springboot.model.Group;
import org.codegym.springboot.service.IGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/groups")
public class GroupController {

    @Autowired
    private IGroupService groupService;

    @GetMapping("")
    public String groupPage(Model model) {
        List<Group> groups = groupService.getAllGroups();
        model.addAttribute("groups", groups);
        return "groups/list";
    }

    @GetMapping("/create")
    public String createGroupPage(Model model) {
        model.addAttribute("group", new Group());
        return "groups/create";
    }

    @PostMapping("/create")
    public String createGroup(Group group) {
        groupService.create(group);
        return "redirect:/groups";
    }
}
