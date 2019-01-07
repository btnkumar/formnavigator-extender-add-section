package formnavigator.extender.add.section;

import java.io.IOException;
import java.util.Locale;
import java.util.ResourceBundle;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
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
@Component(property = "form.navigator.entry.order:Integer=9", service = FormNavigatorEntry.class)
public class OrganizationInstallProductsFormNavigatorEntry
    extends BaseJSPFormNavigatorEntry<Organization> implements FormNavigatorEntry<Organization> {

  @Override
  public String getCategoryKey() {
    return FormNavigatorConstants.CATEGORY_KEY_ORGANIZATION_ORGANIZATION_INFORMATION;
  }

  @Override
  public String getFormNavigatorId() {
    return FormNavigatorConstants.FORM_NAVIGATOR_ID_ORGANIZATIONS;
  }

  @Override
  protected String getJspPath() {
    return "/organization/install_products.jsp";
  }

  @Override
  public String getKey() {
    return "install-products";
  }

  @Override
  public String getLabel(Locale locale) {
    ResourceBundle resourceBundle =
        ResourceBundleUtil.getBundle("content.Language", locale, getClass());
    return resourceBundle.getString("install-products");
  }

  @Override
  public void include(HttpServletRequest request, HttpServletResponse response) throws IOException {
    super.include(request, response);
  }

  @Override
  @Reference(target = "(osgi.web.symbolicname=formnavigator.extender.add.section)", unbind = "-")
  public void setServletContext(ServletContext servletContext) {
    super.setServletContext(servletContext);
  }

}
