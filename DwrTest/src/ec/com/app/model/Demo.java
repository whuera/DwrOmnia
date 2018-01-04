package ec.com.app.model;


/**
 * The Class Demo.
 */
public class Demo {
	
	 /**
 	 * Say hello.
 	 *
 	 * @param name the name
 	 * @return the string
 	 */
 	public String sayHello(String name) {
	        return "hola 2, " + name;
	    }
	/* 
	 public String getInclude() throws ServletException, IOException
	    {
	        WebContext wctx = WebContextFactory.get();
	        return wctx.forwardToString("/simple/forward.html");
	    }
	 
	 public String[] getInsert() throws ServletException, IOException
	    {
	        return new String[]
	        {
	            WebContextFactory.get().forwardToString("/insert.html"),
	            VersionUtil.getLabel(),
	        };
	    }
*/
}
