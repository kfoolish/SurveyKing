package cn.surveyking.server.domain.dto;

import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * @author javahuang
 * @date 2021/9/17
 */
@Data
public class DownloadQuery {

	/**
	 * 问卷 id
	 */
	@NotNull
	private String projectId;

	/**
	 * 当前答案id
	 */
	private String answerId;

	/**
	 * 导出附件命名表达式
	 */
	private String nameExp;

	@NotNull
	private DownloadType type;

	public enum DownloadType {

		/**
		 * 问卷答案、问卷答案+附件、问卷附件
		 */
		answer, answerAttachment, attachment

	}

}
