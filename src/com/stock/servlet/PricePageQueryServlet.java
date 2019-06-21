package com.stock.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.stock.bean.StockInfoBean;
import com.stock.model.StockQueryModel;

public class PricePageQueryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String page = request.getParameter("page"); // ��ҳ����Ҫ��ʾ��ҳ��
		StockQueryModel sqm = new StockQueryModel(); // ʵ������һ����ҳ��ѯ��ģ�� M��
		List<StockInfoBean> list = null;
		int pageNum = 1; // ��ʾ�ڼ�ҳ
		int pageTotal = 0; // ��ҳ��
		int pageContent = 3; // ÿҳ��ʾ��¼����
		int count = 0; // ���ݿ��ܼ�¼��
		try {
			count = sqm.count(); // ͨ��ģ����ķ���������ݿ��¼����
			if (count > 0) {
				pageTotal = count / pageContent; // ����ҳ��
				if (pageTotal * pageContent != count) { // ��������
					pageTotal = pageTotal + 1;
				}
			}
			if (page != null) { // �����õ���ʾҳ��ֵ��Ϊ��
				pageNum = Integer.parseInt(page); // ���������͵�ת��
			}
			list = sqm.pageListStockPrice(pageNum, pageContent); // ����ģ�ͣ����з�ҳ��ѯ�����ط�ҳ��ʾ������
		} catch (Exception e) {
			e.printStackTrace();
		}
		request.setAttribute("pageTotal", pageTotal);
		request.setAttribute("list", list);
		request.getRequestDispatcher("../priceQuery.jsp").forward(request,
				response);
	}
}