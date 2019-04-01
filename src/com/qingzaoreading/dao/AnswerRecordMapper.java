package com.qingzaoreading.dao;

import com.qingzaoreading.pojo.po.AnswerRecord;
import com.qingzaoreading.pojo.po.AnswerRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AnswerRecordMapper {
    int countByExample(AnswerRecordExample example);

    int deleteByExample(AnswerRecordExample example);

    int deleteByPrimaryKey(Long answerRecordId);

    int insert(AnswerRecord record);

    int insertSelective(AnswerRecord record);

    List<AnswerRecord> selectByExample(AnswerRecordExample example);

    AnswerRecord selectByPrimaryKey(Long answerRecordId);

    int updateByExampleSelective(@Param("record") AnswerRecord record, @Param("example") AnswerRecordExample example);

    int updateByExample(@Param("record") AnswerRecord record, @Param("example") AnswerRecordExample example);

    int updateByPrimaryKeySelective(AnswerRecord record);

    int updateByPrimaryKey(AnswerRecord record);
}