package com.edp.service.taskTrace;

import com.alibaba.dubbo.common.utils.StringUtils;
import com.alibaba.fastjson.JSON;
import com.edp.common.constant.Constants;
import com.edp.common.constant.EDPCodeConstants;
import com.edp.common.utils.BeanCopyUtils;
import com.edp.common.utils.DateUtil;
import com.edp.common.utils.SequenceManage;
import com.edp.common.utils.SqlFormatUtil;
import com.edp.dao.domain.SceneInfoPo;
import com.edp.dao.mapper.FunctionInfoPoMapper;
import com.edp.dao.mapper.SceneInfoPoMapper;
import com.edp.serviceI.bytearrayInfo.ByteArrayInfoServiceI;
import com.edp.serviceI.columnInfo.ColumnInfoServiceI;
import com.edp.serviceI.dto.BytearrayInfoDto;
import com.edp.serviceI.dto.ColumnInfoDto;
import com.edp.serviceI.dto.ColumnPicDto;
import com.edp.serviceI.dto.FunctionInfoDto;
import com.edp.serviceI.dto.TaskInfoDto;
import com.edp.serviceI.dto.TaskTraceDto;
import com.edp.serviceI.functionInfo.FunctionInfoServiceI;
import com.edp.serviceI.product.ProductServiceI;
import com.edp.serviceI.taskTrace.TaskTraceServiceI;

import org.docx4j.openpackaging.exceptions.InvalidFormatException;
import org.docx4j.openpackaging.io.SaveToZipFile;
import org.docx4j.openpackaging.packages.WordprocessingMLPackage;
import org.docx4j.openpackaging.parts.WordprocessingML.MainDocumentPart;
import org.docx4j.wml.P;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 工单操作轨迹服务实现
 * Created by changer on 2016/7/20.
 */
@Service("taskTraceServiceI")
public class TaskTraceServiceImpl implements TaskTraceServiceI {




	@Override
	public TaskTraceDto queryAllTaskTracesByCondition(TaskTraceDto condition) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TaskTraceDto queryTaskTracesByTaskId(String taskId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TaskTraceDto findTaskTraceByPrimaryKey(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TaskTraceDto saveTaskTrace(TaskTraceDto taskTrace) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TaskTraceDto updateTaskTrace(TaskTraceDto taskTrace) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TaskTraceDto deleteTaskTraceByPrimaryKey(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TaskTraceDto deleteTaskTraceByTaskId(String taskId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TaskTraceDto queryTaskTracesForDelayByTaskId(String taskId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TaskTraceDto queryTaskTracesForOwnerChangeByTaskId(String taskId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TaskTraceDto queryTaskTracesForStateChangeByTaskId(String taskId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addFaceTask(String tree, TaskInfoDto taskInfo, String productId, Integer version) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addConnotationTask(String tree, TaskInfoDto taskInfo, String productId, Integer version) {
		// TODO Auto-generated method stub
		
	}

  
}
