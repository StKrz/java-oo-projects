package gr.aueb.cf.ch18.dao;


import gr.aueb.cf.ch18.model.User;

public interface IUserDAO {
    User insert(User user);
    User update(User oldUser, User newUser);
    void deleteById(Long id);
    void deleteBySsn(String ssn);
    User getById(Long id);
    User getBySsn(String ssn);
    boolean ssnNotExists(String ssn);
}
