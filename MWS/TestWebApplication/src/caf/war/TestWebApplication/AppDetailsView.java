package caf.war.TestWebApplication;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import com.webmethods.caf.faces.annotations.ExpireWithPageFlow;
import com.webmethods.caf.faces.annotations.DTManagedBean;
import com.webmethods.caf.faces.annotations.BeanType;


@ManagedBean(name = "AppDetailsView")
@SessionScoped
@ExpireWithPageFlow
@DTManagedBean(displayName = "appDetails", beanType = BeanType.PAGE)
public class AppDetailsView  extends   com.webmethods.caf.faces.bean.BaseWebPageBean {

	/**
	 * Determines if a de-serialized file is compatible with this class.
	 *
	 * Maintainers must change this value if and only if the new version
	 * of this class is not compatible with old versions. See Sun docs
	 * for <a href=http://java.sun.com/j2se/1.5.0/docs/guide/serialization/spec/version.html> 
	 * details. </a>
	 */
	private static final long serialVersionUID = 1L;
	private static final String[][] INITIALIZE_PROPERTY_BINDINGS = new String[][] {
	};
	private transient caf.war.TestWebApplication.TestWebApplication testWebApplication = null;

	/**
	 * Initialize page
	 */
	public String initialize() {
		try {
		    resolveDataBinding(INITIALIZE_PROPERTY_BINDINGS, null, "initialize", true, false);
		} catch (Exception e) {
			error(e);
			log(e);
		}
		return null;	
	}

	public caf.war.TestWebApplication.TestWebApplication getTestWebApplication()  {
		if (testWebApplication == null) {
		    testWebApplication = (caf.war.TestWebApplication.TestWebApplication)resolveExpression("#{TestWebApplication}");
		}
		return testWebApplication;
	}
	
}