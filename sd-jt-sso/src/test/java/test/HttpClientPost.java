package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.junit.Test;

public class HttpClientPost {
	@Test
	public void register() throws Exception {
//		String url = "http://localhost:7900/user/register";
		String url = "http://localhost:8050/jt/sso/user/register";
		Map<String, String> paraMap = new HashMap<String,String>();
		
		paraMap.put("username", "tony222");
		paraMap.put("password", "123456222");
		paraMap.put("phone", "1231222");
		paraMap.put("email", "chenzs1232221@tedu.cn");
		
		String result = httpPostWithForm(url,paraMap);
		System.out.println(result);
	}

	@Test
	public void login() throws Exception {
//		String url = "http://localhost:7900/user/login";
		String url = "http://localhost:8050/jt/sso/user/login";
		Map<String, String> paraMap = new HashMap<String,String>();
		
		paraMap.put("u", "tony");
		paraMap.put("p", "123456");
		
		String result = httpPostWithForm(url,paraMap);
		System.out.println(result);
	}
	
	public static String httpPostWithForm(String url, Map<String, String> paraMap) throws Exception {
		HttpPost httpPost = new HttpPost(url);
		CloseableHttpClient client = HttpClients.createDefault();
		String respContent = null;

		//遍历参数map，设置表单参数
		List<BasicNameValuePair> pairList = new ArrayList<BasicNameValuePair>();
		for (Map.Entry<String, String> entry : paraMap.entrySet()) {
			pairList.add(new BasicNameValuePair(entry.getKey(), entry.getValue()));
		}
		httpPost.setEntity(new UrlEncodedFormEntity(pairList, "utf-8"));

		HttpResponse resp = client.execute(httpPost);
		if (resp.getStatusLine().getStatusCode() == 200) {
			HttpEntity he = resp.getEntity();
			respContent = EntityUtils.toString(he, "UTF-8");
		}
		return respContent;
	}
}
