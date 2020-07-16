/**
 * 
 */
package caf.war.TestWebApplication;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ApplicationScoped;
import com.webmethods.caf.faces.annotations.DTManagedBean;
import com.webmethods.caf.faces.annotations.BeanType;

/**
 * @author y509121
 *
 */

@ManagedBean(name = "TestWebApplication")
@ApplicationScoped
@DTManagedBean(beanType = BeanType.APPLICATION)
public class TestWebApplication extends com.webmethods.caf.faces.bean.BaseApplicationBean {
}