/*
 * Copyright 2008-2009 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package egovframework.com.cmm;

import org.egovframe.rte.ptl.mvc.tags.ui.pagination.AbstractKrdsPaginationRenderer;

/**
 * @Class Name : ImagePaginationRenderer.java
 * @Description : ImagePaginationRenderer Class
 * @Modification Information
 * @
 * @  수정일      수정자              수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2009.03.16           최초생성
 *
 * @author 개발프레임웍크 실행환경 개발팀
 * @since 2009. 03.16
 * @version 1.0
 * @see
 *
 *  Copyright (C) by MOPAS All right reserved.
 */
public class EgovKrdsPaginationRenderer extends AbstractKrdsPaginationRenderer {

	public EgovKrdsPaginationRenderer() {
		initVariables();
	}

	/**
	* PaginationRenderer
	*
	* @see 개발프레임웍크 실행환경 개발팀
	*/
	public void initVariables() {

	    previousPageLabel = "<a onclick=\"{0}({1})\" class=\"page-navi prev\" href=\"#\">이전</a>";
	    previousPageDisabledLabel = "<span class=\"page-navi prev disabled\">이전</span>";
	    firstPageLabel = "<a onclick=\"{0}({1})\" class=\"page-link\" href=\"#\">{2}</a>";
	    currentPageLabel = "<a class=\"page-link active\" href=\"#\">{0}</a>";
	    otherPageLabel = "<a onclick=\"{0}({1})\" class=\"page-link\" href=\"#\">{2}</a>";
	    nextPageLabel = "<a onclick=\"{0}({1})\" class=\"page-navi next\" href=\"#\">다음</a>";
	    nextPageDisabledLabel = "<span class=\"page-navi next disabled\">다음</span>";
	    lastPageLabel = "<a onclick=\"{0}({1})\" class=\"page-link\" href=\"#\">{2}</a>";
	    dotPageLabel = "<span class=\"page-link link-dot\">...</span>";	
	
	}

}
