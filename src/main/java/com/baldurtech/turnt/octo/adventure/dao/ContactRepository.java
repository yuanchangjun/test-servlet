package com.baldurtech.turnt.octo.adventure.dao;

import com.baldurtech.turnt.octo.adventure.domain.Contact;

public class ContactRepository {

    private DatabaseManager db;

    public ContactRepository(DatabaseManager db) {
        this.db = db;
    }

    public void deleteById(Long id) {
        db.executeUpdate("DELETE FROM contact WHERE id=" + id);
    }

    public void update(Contact contact) {
        String sql = "UPDATE contact SET email=?, home_address=?, job=?, job_level=?, memo=?, mobile=?, name=?, office_address=?, vpmn=? WHERE id=?";
        db.executeUpdate(sql, contact.getEmail()
                         , contact.getHomeAddress()
                         , contact.getJob()
                         , contact.getJobLevel()
                         , contact.getMemo()
                         , contact.getMobile()
                         , contact.getName()
                         , contact.getOfficeAddress()
                         , contact.getVpmn()
                         , contact.getId());
    }
}