package formnavigator.extender.add.section;

import java.util.Locale;
import java.util.ResourceBundle;
import org.osgi.service.component.annotations.Component;
import com.liferay.portal.kernel.servlet.taglib.ui.FormNavigatorCategory;
import com.liferay.portal.kernel.servlet.taglib.ui.FormNavigatorConstants;
import com.liferay.portal.kernel.util.ResourceBundleUtil;

/**
 * 
 * @author Nagendra
 *
 */
@Component(immediate = true, property = "form.navigator.category.order:Integer=9",
    service = FormNavigatorCategory.class)
public class OrganizationMisc2FormNavigatorCategory implements FormNavigatorCategory {

  @Override
  public String getFormNavigatorId() {
    return FormNavigatorConstants.FORM_NAVIGATOR_ID_ORGANIZATIONS;
  }

  @Override
  public String getKey() {
    return FormNavigatorConstants.CATEGORY_KEY_ORGANIZATION_MISCELLANEOUS + "2";
  }

  @Override
  public String getLabel(Locale locale) {
//    return LanguageUtil.get(locale, "miscellaneous2");
    ResourceBundle resourceBundle =
        ResourceBundleUtil.getBundle("content.Language", locale, getClass());

    return resourceBundle.getString(getKey());
  }

}
