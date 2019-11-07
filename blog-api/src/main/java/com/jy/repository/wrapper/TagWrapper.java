package com.jy.repository.wrapper;

import java.util.List;

import com.jy.vo.TagVO;

/**
 * @author jy
 * <p>
 * 2019年11月6日
 */
public interface TagWrapper {

    List<TagVO> findAllDetail();

    TagVO getTagDetail(Integer tagId);
}
