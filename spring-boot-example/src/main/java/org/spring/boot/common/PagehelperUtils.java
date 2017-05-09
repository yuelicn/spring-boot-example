package org.spring.boot.common;

import java.util.List;

import com.github.pagehelper.PageInfo;

public class PagehelperUtils<T> {
	
    //结果集
    private List<T> list;
    
    private Page page;
    
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public PagehelperUtils(PageInfo pageInfo) {
		super();
		page = new Page();
		this.list = pageInfo.getList();
		page.setPageNum(pageInfo.getPageNum());
		page.setPageSize(pageInfo.getPageSize());
		page.setSize(pageInfo.getSize());
		page.setTotal(pageInfo.getTotal());
		page.setPages(pageInfo.getPages());
		page.setPrePage(pageInfo.getPrePage());
		page.setNextPage(pageInfo.getNextPage());
		page.setNavigateFirstPage(pageInfo.getNavigateFirstPage());
		page.setNavigateLastPage(pageInfo.getNavigateLastPage());
		page.setNavigatepageNums(pageInfo.getNavigatepageNums());
		
	}

	public List<T> getList() {
		return list;
	}

	public void setList(List<T> list) {
		this.list = list;
	}

	public Page getPage() {
		return page;
	}

	public void setPage(Page page) {
		this.page = page;
	}
}
