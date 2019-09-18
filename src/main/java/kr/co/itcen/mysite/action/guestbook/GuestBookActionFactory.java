package kr.co.itcen.mysite.action.guestbook;

import kr.co.itcen.web.mvc.Action;
import kr.co.itcen.web.mvc.ActionFactory;

public class GuestBookActionFactory extends ActionFactory {

	@Override
	public Action getAction(String actionName) {
		Action action = null;
		
		if("insert".equals(actionName)) {
			action = new InsertAction();
			
		} else if("deleteform".equals(actionName)) { 
			action = new DeleteFormAction();
			
		} else if("delete".equals(actionName)) { 
			action = new DeleteAction();
			
		} else {
			action = new GuestBookAction();
		}
		
		return action;
	}

}
