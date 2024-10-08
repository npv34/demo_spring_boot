package org.codegym.springboot.service.impl;

import org.codegym.springboot.model.Group;
import org.codegym.springboot.repository.GroupRepository;
import org.codegym.springboot.service.IGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GroupService implements IGroupService {
    private GroupRepository groupRepository;
    @Autowired
    public GroupService(GroupRepository groupRepository) {
        this.groupRepository = groupRepository;
    }
    @Override
    public List<Group> getAllGroups() {
        return groupRepository.findAll();
    }

    @Override
    public Group findById(Long id) {
        return groupRepository.findById(id).orElse(null);
    }

    @Override
    public Group create(Group group) {
        return groupRepository.save(group);
    }
}
