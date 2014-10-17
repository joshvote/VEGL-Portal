package org.auscope.portal.server.vegl;

import java.io.Serializable;

/**
 * Simple class that stores information about a job series consisting of
 * one or more jobs.
 *
 * Developed from the original GeodesySeries
 *
 * @author Cihan Altinay
 * @Author Josh Vote
 */
public class VGLFolder implements Serializable {
	/** A unique identifier for this folder */
    private Integer id;
    /** The user owning this folder */
    private String user;
    /** A short name for this folder */
    private String name;
    /** ID of the parent Folder for this folder (or null if root)*/
    private Integer parent;

    /**
     * Default constructor.
     */
    public VGLFolder() {
        user = name = "";
    }

    /**
     * A unique identifier for this folder.
     */
    public Integer getId() {
        return id;
    }

    /**
     * A unique identifier for this folder.
     */
    protected void setId(Integer id) {
        assert (id != null);
        this.id = id;
    }

    /**
     * The user owning this folder
     */
    public String getUser() {
        return user;
    }

    /**
     * The user owning this folder
     */
    public void setUser(String user) {
        assert (user != null);
        this.user = user;
    }

    /**
     *  A short name for this folder
     */
    public String getName() {
        return name;
    }

    /**
     *  A short name for this folder
     */
    public void setName(String name) {
        assert (name != null);
        this.name = name;
    }

    /**
     * ID of the parent Folder for this folder (or null if root)
     * @return
     */
    public Integer getParent() {
        return parent;
    }

    /**
     * ID of the parent Folder for this folder (or null if root)
     * @param parent
     */
    public void setParent(Integer parent) {
        this.parent = parent;
    }

    /**
     * Returns a String representing the state of this <code>GeodesySeries</code>
     * object.
     *
     * @return A summary of the values of this object's fields
     */
    public String toString() {
        return super.toString() +
               ",id=" + id +
               ",user=\"" + user + "\"" +
               ",name=\"" + name + "\"";
    }
}