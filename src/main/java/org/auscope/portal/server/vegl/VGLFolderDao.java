package org.auscope.portal.server.vegl;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A Hibernate-backed VEGLSeries data object
 *
 * @author Cihan Altinay
 * @author Josh Vote  -- Modified for VEGL
 */
public class VGLFolderDao extends HibernateDaoSupport {
    protected final Log logger = LogFactory.getLog(getClass());

    /**
     * Queries for folders for the given user.
     */
    @SuppressWarnings("unchecked")
    public List<VGLFolder> getFoldersForUser(final String user) {
        return (List<VGLFolder>) getHibernateTemplate()
                .findByNamedParam("from VGLFolder j where j.user=:user",
                        "user", user);
    }

    /**
     * Queries for folders for the given user and parent (parent can be null).
     */
    @SuppressWarnings("unchecked")
    public List<VGLFolder> getFoldersForUser(final String user, final Integer parent) {
        Criteria c = getSession().createCriteria(VGLFolder.class);

        c.add(Restrictions.eq("user", user));
        c.add(parent == null ? Restrictions.isNull("parent") : Restrictions.eq("parent", parent));

        return (List<VGLFolder>) c.list();
    }

    /**
     * Retrieves the folder with given ID.
     */
    public VGLFolder get(final int id) {
        return (VGLFolder) getHibernateTemplate().get(VGLFolder.class, id);
    }

    /**
     * Saves or updates the given folder.
     */
    public void save(final VGLFolder folder) {
        getHibernateTemplate().saveOrUpdate(folder);
    }

    /**
     * Delete the given folder
     */
    public void delete(final VGLFolder folder) {
        getHibernateTemplate().delete(folder);
    }
}
