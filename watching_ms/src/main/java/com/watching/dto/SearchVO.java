package com.watching.dto;

public class SearchVO extends PagingVO{
	private String searchType;
	private String keyword;
	
	public SearchVO() {}

	public SearchVO(int total, int nowPage, int cntPerPage) {
		setNowPage(nowPage);
		setCntPerPage(cntPerPage);
		setTotal(total);
		calLastPage(getTotal(), getCntPerPage());
		calStartEndPage(getNowPage(), cntPage);
		calStartEnd(getNowPage(), getCntPerPage());
	}

	public String getSearchType() {
		return searchType;
	}

	public void setSearchType(String searchType) {
		this.searchType = searchType;
	}

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	@Override
	public String toString() {
		return "SearchVO [searchType=" + searchType + ", keyword=" + keyword + ", cntPage=" + cntPage + ", toString()="
				+ super.toString() + "]";
	}

}
