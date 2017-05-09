package org.spring.boot.common;

public class Page {

	// 当前页
	private int pageNum;
	// 每页数量
	private int pageSize;
	// 当前页数量
	private int size;
	// 总记录数
	private long total;
	// 总页数
	private int pages;
	// 前一页
	private int prePage;
	// 下一页
	private int nextPage;
	// 所有导航页号
	private int[] navigatepageNums;
	// 导航条上的第一页
	private int navigateFirstPage;
	// 导航条上的最后一页
	private int navigateLastPage;
	
	public int getPageNum() {
		return pageNum;
	}
	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public long getTotal() {
		return total;
	}
	public void setTotal(long total) {
		this.total = total;
	}
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	public int getPrePage() {
		return prePage;
	}
	public void setPrePage(int prePage) {
		this.prePage = prePage;
	}
	public int getNextPage() {
		return nextPage;
	}
	public void setNextPage(int nextPage) {
		this.nextPage = nextPage;
	}
	public int[] getNavigatepageNums() {
		return navigatepageNums;
	}
	public void setNavigatepageNums(int[] navigatepageNums) {
		this.navigatepageNums = navigatepageNums;
	}
	public int getNavigateFirstPage() {
		return navigateFirstPage;
	}
	public void setNavigateFirstPage(int navigateFirstPage) {
		this.navigateFirstPage = navigateFirstPage;
	}
	public int getNavigateLastPage() {
		return navigateLastPage;
	}
	public void setNavigateLastPage(int navigateLastPage) {
		this.navigateLastPage = navigateLastPage;
	}

}
