package gr.aueb.cf.ch13;

/**
 * This class is a JavaBean that includes the {@link #id},
 * {@link #firstname} and {@link #lastname} of a {@link User}.
 *
 * @author stavr
 * @since 1.0
 * @version 2.0
 */
public class User {
    private Long id;
    private String firstname;
    private String lastname;

    /**
     * This is a <b>default constructor</b>
     * It creates a default {@link User} instance.
     */
    public User() {
    }

    /**
     * <b>Overloaded constructor</b>.
     *
     * @param id
     *          user's id.
     * @param firstname
     *          user's firstname.
     * @param lastname
     *          user's lastname.
     */
    public User(Long id, String firstname, String lastname) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    /**
     * Gets back the {@link #id} of the instance.
     * It is associated with a setter {@link #setId(Long)}.
     *
     * @see #setId(Long)
     *
     * @return
     *      the id of the related instance.
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets instance's {@link #id}.
     *
     * @param id
     *        the {@link #id}.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Gets back the {@link #firstname} of the instance.
     *
     * @return
     *      {@link #firstname}.
     */
    public String getFirstname() {
        return firstname;
    }

    /**
     * Sets instance's {@link #firstname}.
     *
     * @param firstname
     *              the {@link #firstname}.
     */
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    /**
     * Gets back the {@link #lastname} of the instance.
     *
     * @return
     *      {@link #lastname}.
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * Sets instance's {@link #lastname}.
     *
     * @param lastname
     *              {@link #lastname}.
     */
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    /**
     * Returns a String which represents an object {@link User}.
     *
     * @return
     *          a String which contains instance's  {@link #id}, {@link #firstname}, {@link #lastname}.
     */
    @Override
    public String  toString() {
        return "User{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }
}
