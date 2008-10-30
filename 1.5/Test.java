import java.util.Arrays;
import java.util.regex.Pattern;

import org.apache.commons.lang.StringUtils;

import com.googlecode.s2hibernate.struts2.plugin.s2hibernatesession.HibernateSessionInterceptor;
import com.googlecode.s2hibernate.struts2.plugin.s2hibernatesession.HibernateSessionPluginUtils;


public class Test {

	public static void main(String[] args) {
		try {
			
			String tste="oioioi.wwww";
			tste = tste.replace(".", ",");
			String[] testea = tste.split(",");
			System.out.println(testea.toString());
			System.out.println(Arrays.toString(testea).replace("[", "").replace("]", "").replace(", ", "."));
			
			HibernateSessionInterceptor interceptor = new HibernateSessionInterceptor();
			
			String[] nomes = {"facade","facadeOvo","testeFacade","teste2Facade","teste2Dao"};
			/*for (String nome:nomes) {
				System.out.println(
						Pattern.matches(HibernateSessionPluginUtils.wildcardToRegex("facadeOvo"), nome)
						);

			}*/
			System.exit(0);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
