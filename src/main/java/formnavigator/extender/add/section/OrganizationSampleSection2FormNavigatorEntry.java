package formnavigator.extender.add.section;

import java.io.IOException;
import java.util.Locale;
import java.util.ResourceBundle;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.log.LogService;
import com.liferay.portal.kernel.model.Organization;
import com.liferay.portal.kernel.servlet.taglib.ui.BaseJSPFormNavigatorEntry;
import com.liferay.portal.kernel.servlet.taglib.ui.FormNavigatorConstants;
import com.liferay.portal.kernel.servlet.taglib.ui.FormNavigatorEntry;
import com.liferay.portal.kernel.util.ResourceBundleUtil;

/**
 * 
 * @author Nagendra
 *
 */
@Component(immediate = true, property = "form.navigator.entry.order:Integer=10",
    service = FormNavigatorEntry.class)
public class OrganizationSampleSection2FormNavigatorEntry
    extends BaseJSPFormNavigatorEntry<Organization> implements FormNavigatorEntry<Organization> {

  @Override
  public String getCategoryKey() {
    return FormNavigatorConstants.CATEGORY_KEY_ORGANIZATION_MISCELLANEOUS + "2";
  }

  @Override
  public String getKey() {
    return "sample-section2";
  }

  @Override
  protected String getJspPath() {
    return "/organization/sample_section2.jsp";
  }

  @Override
  public String getFormNavigatorId() {
    return FormNavigatorConstants.FORM_NAVIGATOR_ID_ORGANIZATIONS;
  }

  @Override
  public String getLabel(Locale locale) {
    // return LanguageUtil.get(locale, getKey());
    ResourceBundle resourceBundle =
        ResourceBundleUtil.getBundle("content.Language", locale, getClass());

    return resourceBundle.getString(getKey());
  }

  @Override
  public void include(HttpServletRequest request, HttpServletResponse response) throws IOException {
    super.include(request, response);
  }

  @Override
  @Reference(target = "(osgi.web.symbolicname=formnavigator.extender.add.section)", unbind = "-")
  public void setServletContext(ServletContext servletContext) {
    // _log.log(LogService.LOG_INFO, "Inside setServletContext");
    System.out.println("Inside setServletContext");
    super.setServletContext(servletContext);
  }

  @Reference
  private LogService _log;
}
