package com.jy.service;

import java.util.List;

import com.jy.entity.Tag;
import com.jy.vo.TagVO;

/**
 * @author jy
 * <p>
 * 2019年11月9日
 */
public interface TagService {

    List<Tag> findAll();

    Tag getTagById(Integer id);

    Integer saveTag(Tag tag);

    Integer updateTag(Tag tag);

    void deleteTagById(Integer id);

    List<Tag> listHotTags(int limit);

    List<TagVO> findAllDetail();

    TagVO getTagDetail(Integer tagId);

}
