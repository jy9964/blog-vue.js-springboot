package com.jy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jy.entity.Tag;
import com.jy.repository.TagRepository;
import com.jy.service.TagService;
import com.jy.vo.TagVO;

/**
 * @author jy
 * <p>
 * 2019年11月4日
 */
@Service
public class TagServiceImpl implements TagService {

    @Autowired
    private TagRepository tagRepository;


    @Override
    public List<Tag> findAll() {
        return tagRepository.findAll();
    }

    @Override
    public Tag getTagById(Integer id) {
        return tagRepository.getOne(id);
    }

    @Override
    @Transactional
    public Integer saveTag(Tag tag) {

        return tagRepository.save(tag).getId();
    }

    @Override
    @Transactional
    public Integer updateTag(Tag tag) {
        Tag oldTag = tagRepository.getOne(tag.getId());

        oldTag.setTagname(tag.getTagname());
        oldTag.setAvatar(tag.getAvatar());

        return oldTag.getId();
    }

    @Override
    @Transactional
    public void deleteTagById(Integer id) {
        tagRepository.delete(id);
    }

    @Override
    public List<Tag> listHotTags(int limit) {

        return tagRepository.listHotTagsByArticleUse(limit);
    }

    @Override
    public List<TagVO> findAllDetail() {
        return tagRepository.findAllDetail();
    }

    @Override
    public TagVO getTagDetail(Integer tagId) {
        return tagRepository.getTagDetail(tagId);
    }
}
