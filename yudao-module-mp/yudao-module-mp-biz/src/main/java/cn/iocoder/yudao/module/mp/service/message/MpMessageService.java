package cn.iocoder.yudao.module.mp.service.message;

import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.module.mp.controller.admin.message.vo.MpMessagePageReqVO;
import cn.iocoder.yudao.module.mp.dal.dataobject.message.MpMessageDO;
import me.chanjar.weixin.mp.bean.message.WxMpXmlMessage;

/**
 * 粉丝消息表 Service 接口
 *
 * @author 芋道源码
 */
public interface MpMessageService {

    // TODO 芋艿：方法名要优化下
    /**
     * 获得粉丝消息表分页
     *
     * @param pageReqVO 分页查询
     * @return 粉丝消息表 分页
     */
    PageResult<MpMessageDO> getWxFansMsgPage(MpMessagePageReqVO pageReqVO);

    /**
     * 保存粉丝消息，来自用户发送
     *
     * @param appId 微信公众号 appId
     * @param wxMessage 消息
     */
    void createFromUser(String appId, WxMpXmlMessage wxMessage);
}