package org.codegym.springboot.service;

import org.codegym.springboot.model.Group;

import java.util.List;

public interface IGroupService {
    List<Group> getAllGroups();
    Group findById(Long id);
    Group create(Group group);

}
