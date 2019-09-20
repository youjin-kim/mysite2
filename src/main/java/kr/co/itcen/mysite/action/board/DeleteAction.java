package kr.co.itcen.mysite.action.board;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.co.itcen.mysite.dao.BoardDao;
import kr.co.itcen.mysite.vo.BoardVo;
import kr.co.itcen.web.WebUtils;
import kr.co.itcen.web.mvc.Action;

public class DeleteAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String gNo = request.getParameter("gNo");
		String oNo = request.getParameter("oNo");
		String depth = request.getParameter("depth");
		
//		HttpSession session = request.getSession();
//		UserVo authUser = (UserVo) session.getAttribute("authUser");
		
		Long no = Long.parseLong(request.getParameter("no"));
		BoardVo vo = new BoardVo();
		vo.setNo(no);
		new BoardDao().delete(vo);
		
//		request.setAttribute("vo", vo);
//		String p = request.getParameter("p");
//		request.setAttribute("p", p);
//		request.setAttribute("authUser", authUser);
		
		WebUtils.redirect(request, response, request.getContextPath() + "/board");
	}

}
