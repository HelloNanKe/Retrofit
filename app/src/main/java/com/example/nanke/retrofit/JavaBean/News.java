package com.example.nanke.retrofit.JavaBean;

import java.util.List;

/**
 * Created by zt on 2017/3/5.
 */

public class News {

    /**
     * reason : 成功的返回
     * result : {"stat":"1","data":[{"uniquekey":"5dcfab106cf77e1741b57bfadacd3d12","title":"六旬老妇遭儿子暴打 11根肋骨断裂左耳膜穿孔","date":"2017-03-05 13:30","category":"头条","author_name":"江苏电视台","url":"http://mini.eastday.com/mobile/170305133038448.html","thumbnail_pic_s":"http://08.imgmini.eastday.com/mobile/20170305/20170305133038_244ade3f757f57672ca305f9692f6a35_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://08.imgmini.eastday.com/mobile/20170305/20170305133038_244ade3f757f57672ca305f9692f6a35_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://08.imgmini.eastday.com/mobile/20170305/20170305133038_244ade3f757f57672ca305f9692f6a35_3_mwpm_03200403.jpeg"},{"uniquekey":"299cc63683ab269b0130f2d0854ae2bf","title":"卓长立代表建议：家政行业应建诚信记录平台，根治失信现象","date":"2017-03-05 14:36","category":"头条","author_name":"澎湃新闻","url":"http://mini.eastday.com/mobile/170305143647418.html","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20170305/20170305143647_6850fd003a3cf64e80a374958513c686_1_mwpm_03200403.jpeg"},{"uniquekey":"3a829d0fa3e9c990806b3ef9946529d8","title":"安徽宣城市委书记韩军：宣城计划再打造2-3家5A级景区","date":"2017-03-05 14:27","category":"头条","author_name":"人民网","url":"http://mini.eastday.com/mobile/170305142743874.html","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20170305/20170305142743_a190fe76881101a8600623bbcdf230eb_1_mwpm_03200403.jpeg"},{"uniquekey":"27618cd0967d371c56d900263f9fd7c1","title":"日自民党正式延长总裁任期 安倍晋三或可长期执政","date":"2017-03-05 13:52","category":"头条","author_name":"新华网","url":"http://mini.eastday.com/mobile/170305135206548.html","thumbnail_pic_s":"http://05.imgmini.eastday.com/mobile/20170305/20170305135206_30568927f03d5b848bd7f469a3df450a_1_mwpm_03200403.jpeg"},{"uniquekey":"076e289025862feaee0f9ad65eca52d9","title":"农业部部长韩长赋：中国农产品质量安全总体稳定向好","date":"2017-03-05 13:48","category":"头条","author_name":"澎湃新闻","url":"http://mini.eastday.com/mobile/170305134809905.html","thumbnail_pic_s":"http://03.imgmini.eastday.com/mobile/20170305/20170305134809_2937e7caccd82155f28a6d103d24f5fd_1_mwpm_03200403.jpeg"},{"uniquekey":"715725f700f69fdf9865025ab7252a58","title":"河南现罕见巨型野生\u201c亚洲人参\u201d 重约300斤","date":"2017-03-05 13:44","category":"头条","author_name":"济源晨报","url":"http://mini.eastday.com/mobile/170305134433274.html","thumbnail_pic_s":"http://03.imgmini.eastday.com/mobile/20170305/20170305134433_5fab7d2770e514a613bc96a25d2416a6_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://03.imgmini.eastday.com/mobile/20170305/20170305134433_5fab7d2770e514a613bc96a25d2416a6_2_mwpm_03200403.jpeg"},{"uniquekey":"aa6e64bdf790ab8aca3d292cba247d81","title":"日印首脑商谈，安培欲将\u201c与中国抗衡\u201d","date":"2017-03-05 13:25","category":"头条","author_name":"娱乐圈那些破事","url":"http://mini.eastday.com/mobile/170305132542114.html","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20170305/20170305132542_f9adfb301f738ce5868c5516e04039b7_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://00.imgmini.eastday.com/mobile/20170305/20170305132542_f9adfb301f738ce5868c5516e04039b7_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://00.imgmini.eastday.com/mobile/20170305/20170305132542_f9adfb301f738ce5868c5516e04039b7_3_mwpm_03200403.jpeg"},{"uniquekey":"c11bec6d7a87d0ca9dcf31996e494359","title":"美国惊现水门事件之后最大政治丑闻？","date":"2017-03-05 13:15","category":"头条","author_name":"看看新闻Knews","url":"http://mini.eastday.com/mobile/170305131557552.html","thumbnail_pic_s":"http://05.imgmini.eastday.com/mobile/20170305/20170305131557_451e610884d4c3402e90a63fbb02fb22_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://05.imgmini.eastday.com/mobile/20170305/20170305131557_451e610884d4c3402e90a63fbb02fb22_6_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://05.imgmini.eastday.com/mobile/20170305/20170305131557_451e610884d4c3402e90a63fbb02fb22_8_mwpm_03200403.jpeg"},{"uniquekey":"8630f5dbb97d7a4f536a8b40d20b3df4","title":"国台办主任张志军：2017年两岸关系趋于复杂严峻","date":"2017-03-05 13:07","category":"头条","author_name":"澎湃新闻网","url":"http://mini.eastday.com/mobile/170305130710567.html","thumbnail_pic_s":"http://03.imgmini.eastday.com/mobile/20170305/20170305130710_2a9c79568601ccbb96633646ec2e3dc5_1_mwpm_03200403.jpeg"},{"uniquekey":"684b039bc238f99d7ca06838b497a845","title":"太监李莲英的棺椁被打开后，考古人员惊出一身冷汗，至今迷雾重重","date":"2017-03-05 13:04","category":"头条","author_name":"敏敏爱历史","url":"http://mini.eastday.com/mobile/170305130446272.html","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20170305/20170305130446_a8459b1e5a8c22b9fbf8b2e378a7709b_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://01.imgmini.eastday.com/mobile/20170305/20170305130446_a8459b1e5a8c22b9fbf8b2e378a7709b_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://01.imgmini.eastday.com/mobile/20170305/20170305130446_a8459b1e5a8c22b9fbf8b2e378a7709b_3_mwpm_03200403.jpeg"},{"uniquekey":"5251b106dc9aee97945e736269af2742","title":"傅莹\u201c怒怼\u201dCNN记者 哪句话成媒体眼中\u201c金句\u201d？","date":"2017-03-05 13:01","category":"头条","author_name":"人民网舆情监测室","url":"http://mini.eastday.com/mobile/170305130137068.html","thumbnail_pic_s":"http://08.imgmini.eastday.com/mobile/20170305/20170305130137_be30a51b5ebc08996e79bc7575615b74_2_mwpm_03200403.png"},{"uniquekey":"0dd68ef75a59efedcb98e89824cf28d1","title":"广州一小学招生 要求家长本科以上学历","date":"2017-03-05 12:57","category":"头条","author_name":"广东广播电视台今日最新闻","url":"http://mini.eastday.com/mobile/170305125724254.html","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20170305/20170305125724_6b99ec7617c9dc2ff7a08789ef05f691_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://07.imgmini.eastday.com/mobile/20170305/20170305125724_6b99ec7617c9dc2ff7a08789ef05f691_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://07.imgmini.eastday.com/mobile/20170305/20170305125724_6b99ec7617c9dc2ff7a08789ef05f691_3_mwpm_03200403.jpeg"},{"uniquekey":"f5492820cc21f221f146c96c4b9ebd86","title":"俄罗斯被迫放弃这一武器？中国军迷表示太可惜","date":"2017-03-05 12:51","category":"头条","author_name":"坠母的世界1","url":"http://mini.eastday.com/mobile/170305125108649.html","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20170305/20170305125108_f090915e7518c44e8a2b9622fa6918fa_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://07.imgmini.eastday.com/mobile/20170305/20170305125108_f090915e7518c44e8a2b9622fa6918fa_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://07.imgmini.eastday.com/mobile/20170305/20170305125108_f090915e7518c44e8a2b9622fa6918fa_3_mwpm_03200403.jpeg"},{"uniquekey":"f057dcb48f8e4f53afd493bd2e6b2115","title":"政府工作报告揭秘：总理亲自将这些内容写入报告","date":"2017-03-05 12:47","category":"头条","author_name":"新京报即时新闻(北京)","url":"http://mini.eastday.com/mobile/170305124706674.html","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20170305/20170305124706_759f1487e8c3db8a9425f0bab33962fe_1_mwpm_03200403.jpeg"},{"uniquekey":"9e629153f27b572b48b24c600668802d","title":"广州明天冷空气来袭！阴雨降温又来了","date":"2017-03-05 12:46","category":"头条","author_name":"新快报","url":"http://mini.eastday.com/mobile/170305124636296.html","thumbnail_pic_s":"http://03.imgmini.eastday.com/mobile/20170305/20170305124636_777e147a272a947bc190515433df1a9c_1_mwpm_03200403.jpg"},{"uniquekey":"6558a9b968874a2bfdb6ec0fd02cfde8","title":"军队人大代表：军队网络安全人才培养应立足军地共育共用","date":"2017-03-05 12:40","category":"头条","author_name":"解放军报","url":"http://mini.eastday.com/mobile/170305124054635.html","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20170305/20170305124054_723e90282ce175be5f0223f35c1a37bf_1_mwpm_03200403.jpeg"},{"uniquekey":"d81405c9840bdb4599fbf60a72714f1b","title":"特朗普团队空缺严重！奥巴马即将卷土重来？","date":"2017-03-05 12:39","category":"头条","author_name":"天津逍遥子","url":"http://mini.eastday.com/mobile/170305123931589.html","thumbnail_pic_s":"http://06.imgmini.eastday.com/mobile/20170305/20170305_46e0a2091bd117fc155c9ea1e49bf213_cover_mwpm_03200403.jpeg"},{"uniquekey":"3e7fabca142808362b67be86ad535639","title":"交通部部长李小鹏首次亮相部长通道 答记者问大盘点","date":"2017-03-05 12:37","category":"头条","author_name":"中国网财经","url":"http://mini.eastday.com/mobile/170305123737970.html","thumbnail_pic_s":"http://03.imgmini.eastday.com/mobile/20170305/20170305123737_4cea37afce9fd9c0191c9b848c1f0ec2_1_mwpm_03200403.jpeg"},{"uniquekey":"6792ca86954017abce2485f5919fceec","title":"旅居加拿大退休干部争领中国养老金？官方：系误读","date":"2017-03-05 12:33","category":"头条","author_name":"中国侨网","url":"http://mini.eastday.com/mobile/170305123335010.html","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20170305/20170305123335_2ba1ddd5188fece29f7432d1874a8bc8_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://00.imgmini.eastday.com/mobile/20170305/20170305123335_2ba1ddd5188fece29f7432d1874a8bc8_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://00.imgmini.eastday.com/mobile/20170305/20170305123335_2ba1ddd5188fece29f7432d1874a8bc8_3_mwpm_03200403.jpeg"},{"uniquekey":"75d5aa19ff04891af9fb30c377a0ed37","title":"韩国乐天激怒中国 互联网企业霸气回应获网友点赞","date":"2017-03-05 12:24","category":"头条","author_name":"科技新观察","url":"http://mini.eastday.com/mobile/170305122410212.html","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20170305/20170305122410_3c4eae243f069df085c7b9a05a59c800_1_mwpm_03200403.png","thumbnail_pic_s02":"http://04.imgmini.eastday.com/mobile/20170305/20170305122410_3c4eae243f069df085c7b9a05a59c800_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://04.imgmini.eastday.com/mobile/20170305/20170305122410_3c4eae243f069df085c7b9a05a59c800_3_mwpm_03200403.jpeg"},{"uniquekey":"1206fbd15e6808ea88ecfdde4d0bca90","title":"泰国男子婚礼上开枪为新人庆祝 误将邻居打死","date":"2017-03-05 12:23","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/170305122300314.html","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20170305/20170305122300_79ead2a35bed042e84e3ab3efe1a8435_1_mwpm_03200403.jpeg"},{"uniquekey":"b673d3d1d3eb9e4f061f102b5673905b","title":"刚刚确定，你的养老金今年还会上涨！","date":"2017-03-05 12:22","category":"头条","author_name":"思之想之","url":"http://mini.eastday.com/mobile/170305122254769.html","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20170305/20170305122254_b8c00999e9ebec834f52f066fb229f96_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://02.imgmini.eastday.com/mobile/20170305/20170305122254_b8c00999e9ebec834f52f066fb229f96_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://02.imgmini.eastday.com/mobile/20170305/20170305122254_b8c00999e9ebec834f52f066fb229f96_3_mwpm_03200403.jpeg"},{"uniquekey":"7ba336a223799e75067c1de46fda6d8c","title":"[两会财经观察]大调查新发现:2017年 哪些政策热点刷爆你的朋友圈","date":"2017-03-05 12:21","category":"头条","author_name":"央视网","url":"http://mini.eastday.com/mobile/170305122153776.html","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20170305/20170305122153_205198e08717393da760b9f8867bb0db_1_mwpm_03200403.jpeg"},{"uniquekey":"be93dd3575646a6590a8505eb923d0c8","title":"日本经济已成泡沫，安倍强国梦乃天方夜谭","date":"2017-03-05 12:16","category":"头条","author_name":"娱乐圈那些破事","url":"http://mini.eastday.com/mobile/170305121609229.html","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20170305/20170305121609_be8b39973068f0d6d2a8bc54e1d4896e_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://01.imgmini.eastday.com/mobile/20170305/20170305121609_be8b39973068f0d6d2a8bc54e1d4896e_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://01.imgmini.eastday.com/mobile/20170305/20170305121609_be8b39973068f0d6d2a8bc54e1d4896e_3_mwpm_03200403.jpeg"},{"uniquekey":"8a837a3796bdeb7147e6f2f956e287e4","title":"中日经济的实力对拼：结果14亿人都惊呆了！","date":"2017-03-05 12:16","category":"头条","author_name":"娱乐圈那些破事","url":"http://mini.eastday.com/mobile/170305121604780.html","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20170305/20170305121604_0e594d3fddede1383db5bc42fa9934fa_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://04.imgmini.eastday.com/mobile/20170305/20170305121604_0e594d3fddede1383db5bc42fa9934fa_2_mwpm_03200403.jpeg"},{"uniquekey":"be7d51c2a1db8f50d585d7b42b026be1","title":"爱的供养！最美赵敏花积蓄养小10岁男友 吃喝玩乐全买单","date":"2017-03-05 12:16","category":"头条","author_name":"前瞻网","url":"http://mini.eastday.com/mobile/170305121600742.html","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20170305/20170305121600_d8b93b6a768771aad3d6bd599ebeac58_1_mwpm_03200403.jpeg"},{"uniquekey":"b127955f28edd937be5334c5a4c6c1b5","title":"被问\u201c反腐力度是否有所减弱\u201d，监察部部长杨晓渡：无稽之谈","date":"2017-03-05 12:04","category":"头条","author_name":"@中国青年报","url":"http://mini.eastday.com/mobile/170305120452944.html","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20170305/20170305120452_5e6e50e56dc9848f09157421d5d9e9d0_1_mwpm_03200403.jpeg"},{"uniquekey":"9e891d2ee694d18ec458cea857f13458","title":"公益漫画创作者戴继斌：绘漫画关心社区建设，作品超300幅","date":"2017-03-05 11:56","category":"头条","author_name":"澎湃新闻","url":"http://mini.eastday.com/mobile/170305115643216.html","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20170305/20170305115643_28c6780b29d55fd470ce54ae16b4bb7a_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://09.imgmini.eastday.com/mobile/20170305/20170305115643_28c6780b29d55fd470ce54ae16b4bb7a_2_mwpm_03200403.jpeg"},{"uniquekey":"2522ce6073eabed52a8ce9ca7c88eaf7","title":"一个女大学生设计的插座，让所有插座厂家汗颜","date":"2017-03-05 11:43","category":"头条","author_name":"全球创意","url":"http://mini.eastday.com/mobile/170305114319972.html","thumbnail_pic_s":"http://05.imgmini.eastday.com/mobile/20170305/20170305114319_d0d1113aff272ad325c1b2d200b99721_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://05.imgmini.eastday.com/mobile/20170305/20170305114319_d0d1113aff272ad325c1b2d200b99721_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://05.imgmini.eastday.com/mobile/20170305/20170305114319_d0d1113aff272ad325c1b2d200b99721_3_mwpm_03200403.jpeg"},{"uniquekey":"f83d2991767f52c9bc0250b464e18570","title":"家中5000元不翼而飞 夫妇报警后丈夫被拘留","date":"2017-03-05 11:43","category":"头条","author_name":"大浙网","url":"http://mini.eastday.com/mobile/170305114319026.html","thumbnail_pic_s":"http://05.imgmini.eastday.com/mobile/20170305/20170305114319_5f3d08e5fdaaa3fcff1b8d45f8540415_1_mwpm_03200403.jpeg"}]}
     * error_code : 0
     */

    private String reason;
    private ResultBean result;
    private int error_code;

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public static class ResultBean {
        /**
         * stat : 1
         * data : [{"uniquekey":"5dcfab106cf77e1741b57bfadacd3d12","title":"六旬老妇遭儿子暴打 11根肋骨断裂左耳膜穿孔","date":"2017-03-05 13:30","category":"头条","author_name":"江苏电视台","url":"http://mini.eastday.com/mobile/170305133038448.html","thumbnail_pic_s":"http://08.imgmini.eastday.com/mobile/20170305/20170305133038_244ade3f757f57672ca305f9692f6a35_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://08.imgmini.eastday.com/mobile/20170305/20170305133038_244ade3f757f57672ca305f9692f6a35_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://08.imgmini.eastday.com/mobile/20170305/20170305133038_244ade3f757f57672ca305f9692f6a35_3_mwpm_03200403.jpeg"},{"uniquekey":"299cc63683ab269b0130f2d0854ae2bf","title":"卓长立代表建议：家政行业应建诚信记录平台，根治失信现象","date":"2017-03-05 14:36","category":"头条","author_name":"澎湃新闻","url":"http://mini.eastday.com/mobile/170305143647418.html","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20170305/20170305143647_6850fd003a3cf64e80a374958513c686_1_mwpm_03200403.jpeg"},{"uniquekey":"3a829d0fa3e9c990806b3ef9946529d8","title":"安徽宣城市委书记韩军：宣城计划再打造2-3家5A级景区","date":"2017-03-05 14:27","category":"头条","author_name":"人民网","url":"http://mini.eastday.com/mobile/170305142743874.html","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20170305/20170305142743_a190fe76881101a8600623bbcdf230eb_1_mwpm_03200403.jpeg"},{"uniquekey":"27618cd0967d371c56d900263f9fd7c1","title":"日自民党正式延长总裁任期 安倍晋三或可长期执政","date":"2017-03-05 13:52","category":"头条","author_name":"新华网","url":"http://mini.eastday.com/mobile/170305135206548.html","thumbnail_pic_s":"http://05.imgmini.eastday.com/mobile/20170305/20170305135206_30568927f03d5b848bd7f469a3df450a_1_mwpm_03200403.jpeg"},{"uniquekey":"076e289025862feaee0f9ad65eca52d9","title":"农业部部长韩长赋：中国农产品质量安全总体稳定向好","date":"2017-03-05 13:48","category":"头条","author_name":"澎湃新闻","url":"http://mini.eastday.com/mobile/170305134809905.html","thumbnail_pic_s":"http://03.imgmini.eastday.com/mobile/20170305/20170305134809_2937e7caccd82155f28a6d103d24f5fd_1_mwpm_03200403.jpeg"},{"uniquekey":"715725f700f69fdf9865025ab7252a58","title":"河南现罕见巨型野生\u201c亚洲人参\u201d 重约300斤","date":"2017-03-05 13:44","category":"头条","author_name":"济源晨报","url":"http://mini.eastday.com/mobile/170305134433274.html","thumbnail_pic_s":"http://03.imgmini.eastday.com/mobile/20170305/20170305134433_5fab7d2770e514a613bc96a25d2416a6_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://03.imgmini.eastday.com/mobile/20170305/20170305134433_5fab7d2770e514a613bc96a25d2416a6_2_mwpm_03200403.jpeg"},{"uniquekey":"aa6e64bdf790ab8aca3d292cba247d81","title":"日印首脑商谈，安培欲将\u201c与中国抗衡\u201d","date":"2017-03-05 13:25","category":"头条","author_name":"娱乐圈那些破事","url":"http://mini.eastday.com/mobile/170305132542114.html","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20170305/20170305132542_f9adfb301f738ce5868c5516e04039b7_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://00.imgmini.eastday.com/mobile/20170305/20170305132542_f9adfb301f738ce5868c5516e04039b7_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://00.imgmini.eastday.com/mobile/20170305/20170305132542_f9adfb301f738ce5868c5516e04039b7_3_mwpm_03200403.jpeg"},{"uniquekey":"c11bec6d7a87d0ca9dcf31996e494359","title":"美国惊现水门事件之后最大政治丑闻？","date":"2017-03-05 13:15","category":"头条","author_name":"看看新闻Knews","url":"http://mini.eastday.com/mobile/170305131557552.html","thumbnail_pic_s":"http://05.imgmini.eastday.com/mobile/20170305/20170305131557_451e610884d4c3402e90a63fbb02fb22_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://05.imgmini.eastday.com/mobile/20170305/20170305131557_451e610884d4c3402e90a63fbb02fb22_6_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://05.imgmini.eastday.com/mobile/20170305/20170305131557_451e610884d4c3402e90a63fbb02fb22_8_mwpm_03200403.jpeg"},{"uniquekey":"8630f5dbb97d7a4f536a8b40d20b3df4","title":"国台办主任张志军：2017年两岸关系趋于复杂严峻","date":"2017-03-05 13:07","category":"头条","author_name":"澎湃新闻网","url":"http://mini.eastday.com/mobile/170305130710567.html","thumbnail_pic_s":"http://03.imgmini.eastday.com/mobile/20170305/20170305130710_2a9c79568601ccbb96633646ec2e3dc5_1_mwpm_03200403.jpeg"},{"uniquekey":"684b039bc238f99d7ca06838b497a845","title":"太监李莲英的棺椁被打开后，考古人员惊出一身冷汗，至今迷雾重重","date":"2017-03-05 13:04","category":"头条","author_name":"敏敏爱历史","url":"http://mini.eastday.com/mobile/170305130446272.html","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20170305/20170305130446_a8459b1e5a8c22b9fbf8b2e378a7709b_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://01.imgmini.eastday.com/mobile/20170305/20170305130446_a8459b1e5a8c22b9fbf8b2e378a7709b_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://01.imgmini.eastday.com/mobile/20170305/20170305130446_a8459b1e5a8c22b9fbf8b2e378a7709b_3_mwpm_03200403.jpeg"},{"uniquekey":"5251b106dc9aee97945e736269af2742","title":"傅莹\u201c怒怼\u201dCNN记者 哪句话成媒体眼中\u201c金句\u201d？","date":"2017-03-05 13:01","category":"头条","author_name":"人民网舆情监测室","url":"http://mini.eastday.com/mobile/170305130137068.html","thumbnail_pic_s":"http://08.imgmini.eastday.com/mobile/20170305/20170305130137_be30a51b5ebc08996e79bc7575615b74_2_mwpm_03200403.png"},{"uniquekey":"0dd68ef75a59efedcb98e89824cf28d1","title":"广州一小学招生 要求家长本科以上学历","date":"2017-03-05 12:57","category":"头条","author_name":"广东广播电视台今日最新闻","url":"http://mini.eastday.com/mobile/170305125724254.html","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20170305/20170305125724_6b99ec7617c9dc2ff7a08789ef05f691_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://07.imgmini.eastday.com/mobile/20170305/20170305125724_6b99ec7617c9dc2ff7a08789ef05f691_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://07.imgmini.eastday.com/mobile/20170305/20170305125724_6b99ec7617c9dc2ff7a08789ef05f691_3_mwpm_03200403.jpeg"},{"uniquekey":"f5492820cc21f221f146c96c4b9ebd86","title":"俄罗斯被迫放弃这一武器？中国军迷表示太可惜","date":"2017-03-05 12:51","category":"头条","author_name":"坠母的世界1","url":"http://mini.eastday.com/mobile/170305125108649.html","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20170305/20170305125108_f090915e7518c44e8a2b9622fa6918fa_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://07.imgmini.eastday.com/mobile/20170305/20170305125108_f090915e7518c44e8a2b9622fa6918fa_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://07.imgmini.eastday.com/mobile/20170305/20170305125108_f090915e7518c44e8a2b9622fa6918fa_3_mwpm_03200403.jpeg"},{"uniquekey":"f057dcb48f8e4f53afd493bd2e6b2115","title":"政府工作报告揭秘：总理亲自将这些内容写入报告","date":"2017-03-05 12:47","category":"头条","author_name":"新京报即时新闻(北京)","url":"http://mini.eastday.com/mobile/170305124706674.html","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20170305/20170305124706_759f1487e8c3db8a9425f0bab33962fe_1_mwpm_03200403.jpeg"},{"uniquekey":"9e629153f27b572b48b24c600668802d","title":"广州明天冷空气来袭！阴雨降温又来了","date":"2017-03-05 12:46","category":"头条","author_name":"新快报","url":"http://mini.eastday.com/mobile/170305124636296.html","thumbnail_pic_s":"http://03.imgmini.eastday.com/mobile/20170305/20170305124636_777e147a272a947bc190515433df1a9c_1_mwpm_03200403.jpg"},{"uniquekey":"6558a9b968874a2bfdb6ec0fd02cfde8","title":"军队人大代表：军队网络安全人才培养应立足军地共育共用","date":"2017-03-05 12:40","category":"头条","author_name":"解放军报","url":"http://mini.eastday.com/mobile/170305124054635.html","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20170305/20170305124054_723e90282ce175be5f0223f35c1a37bf_1_mwpm_03200403.jpeg"},{"uniquekey":"d81405c9840bdb4599fbf60a72714f1b","title":"特朗普团队空缺严重！奥巴马即将卷土重来？","date":"2017-03-05 12:39","category":"头条","author_name":"天津逍遥子","url":"http://mini.eastday.com/mobile/170305123931589.html","thumbnail_pic_s":"http://06.imgmini.eastday.com/mobile/20170305/20170305_46e0a2091bd117fc155c9ea1e49bf213_cover_mwpm_03200403.jpeg"},{"uniquekey":"3e7fabca142808362b67be86ad535639","title":"交通部部长李小鹏首次亮相部长通道 答记者问大盘点","date":"2017-03-05 12:37","category":"头条","author_name":"中国网财经","url":"http://mini.eastday.com/mobile/170305123737970.html","thumbnail_pic_s":"http://03.imgmini.eastday.com/mobile/20170305/20170305123737_4cea37afce9fd9c0191c9b848c1f0ec2_1_mwpm_03200403.jpeg"},{"uniquekey":"6792ca86954017abce2485f5919fceec","title":"旅居加拿大退休干部争领中国养老金？官方：系误读","date":"2017-03-05 12:33","category":"头条","author_name":"中国侨网","url":"http://mini.eastday.com/mobile/170305123335010.html","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20170305/20170305123335_2ba1ddd5188fece29f7432d1874a8bc8_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://00.imgmini.eastday.com/mobile/20170305/20170305123335_2ba1ddd5188fece29f7432d1874a8bc8_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://00.imgmini.eastday.com/mobile/20170305/20170305123335_2ba1ddd5188fece29f7432d1874a8bc8_3_mwpm_03200403.jpeg"},{"uniquekey":"75d5aa19ff04891af9fb30c377a0ed37","title":"韩国乐天激怒中国 互联网企业霸气回应获网友点赞","date":"2017-03-05 12:24","category":"头条","author_name":"科技新观察","url":"http://mini.eastday.com/mobile/170305122410212.html","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20170305/20170305122410_3c4eae243f069df085c7b9a05a59c800_1_mwpm_03200403.png","thumbnail_pic_s02":"http://04.imgmini.eastday.com/mobile/20170305/20170305122410_3c4eae243f069df085c7b9a05a59c800_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://04.imgmini.eastday.com/mobile/20170305/20170305122410_3c4eae243f069df085c7b9a05a59c800_3_mwpm_03200403.jpeg"},{"uniquekey":"1206fbd15e6808ea88ecfdde4d0bca90","title":"泰国男子婚礼上开枪为新人庆祝 误将邻居打死","date":"2017-03-05 12:23","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/170305122300314.html","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20170305/20170305122300_79ead2a35bed042e84e3ab3efe1a8435_1_mwpm_03200403.jpeg"},{"uniquekey":"b673d3d1d3eb9e4f061f102b5673905b","title":"刚刚确定，你的养老金今年还会上涨！","date":"2017-03-05 12:22","category":"头条","author_name":"思之想之","url":"http://mini.eastday.com/mobile/170305122254769.html","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20170305/20170305122254_b8c00999e9ebec834f52f066fb229f96_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://02.imgmini.eastday.com/mobile/20170305/20170305122254_b8c00999e9ebec834f52f066fb229f96_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://02.imgmini.eastday.com/mobile/20170305/20170305122254_b8c00999e9ebec834f52f066fb229f96_3_mwpm_03200403.jpeg"},{"uniquekey":"7ba336a223799e75067c1de46fda6d8c","title":"[两会财经观察]大调查新发现:2017年 哪些政策热点刷爆你的朋友圈","date":"2017-03-05 12:21","category":"头条","author_name":"央视网","url":"http://mini.eastday.com/mobile/170305122153776.html","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20170305/20170305122153_205198e08717393da760b9f8867bb0db_1_mwpm_03200403.jpeg"},{"uniquekey":"be93dd3575646a6590a8505eb923d0c8","title":"日本经济已成泡沫，安倍强国梦乃天方夜谭","date":"2017-03-05 12:16","category":"头条","author_name":"娱乐圈那些破事","url":"http://mini.eastday.com/mobile/170305121609229.html","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20170305/20170305121609_be8b39973068f0d6d2a8bc54e1d4896e_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://01.imgmini.eastday.com/mobile/20170305/20170305121609_be8b39973068f0d6d2a8bc54e1d4896e_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://01.imgmini.eastday.com/mobile/20170305/20170305121609_be8b39973068f0d6d2a8bc54e1d4896e_3_mwpm_03200403.jpeg"},{"uniquekey":"8a837a3796bdeb7147e6f2f956e287e4","title":"中日经济的实力对拼：结果14亿人都惊呆了！","date":"2017-03-05 12:16","category":"头条","author_name":"娱乐圈那些破事","url":"http://mini.eastday.com/mobile/170305121604780.html","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20170305/20170305121604_0e594d3fddede1383db5bc42fa9934fa_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://04.imgmini.eastday.com/mobile/20170305/20170305121604_0e594d3fddede1383db5bc42fa9934fa_2_mwpm_03200403.jpeg"},{"uniquekey":"be7d51c2a1db8f50d585d7b42b026be1","title":"爱的供养！最美赵敏花积蓄养小10岁男友 吃喝玩乐全买单","date":"2017-03-05 12:16","category":"头条","author_name":"前瞻网","url":"http://mini.eastday.com/mobile/170305121600742.html","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20170305/20170305121600_d8b93b6a768771aad3d6bd599ebeac58_1_mwpm_03200403.jpeg"},{"uniquekey":"b127955f28edd937be5334c5a4c6c1b5","title":"被问\u201c反腐力度是否有所减弱\u201d，监察部部长杨晓渡：无稽之谈","date":"2017-03-05 12:04","category":"头条","author_name":"@中国青年报","url":"http://mini.eastday.com/mobile/170305120452944.html","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20170305/20170305120452_5e6e50e56dc9848f09157421d5d9e9d0_1_mwpm_03200403.jpeg"},{"uniquekey":"9e891d2ee694d18ec458cea857f13458","title":"公益漫画创作者戴继斌：绘漫画关心社区建设，作品超300幅","date":"2017-03-05 11:56","category":"头条","author_name":"澎湃新闻","url":"http://mini.eastday.com/mobile/170305115643216.html","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20170305/20170305115643_28c6780b29d55fd470ce54ae16b4bb7a_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://09.imgmini.eastday.com/mobile/20170305/20170305115643_28c6780b29d55fd470ce54ae16b4bb7a_2_mwpm_03200403.jpeg"},{"uniquekey":"2522ce6073eabed52a8ce9ca7c88eaf7","title":"一个女大学生设计的插座，让所有插座厂家汗颜","date":"2017-03-05 11:43","category":"头条","author_name":"全球创意","url":"http://mini.eastday.com/mobile/170305114319972.html","thumbnail_pic_s":"http://05.imgmini.eastday.com/mobile/20170305/20170305114319_d0d1113aff272ad325c1b2d200b99721_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://05.imgmini.eastday.com/mobile/20170305/20170305114319_d0d1113aff272ad325c1b2d200b99721_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://05.imgmini.eastday.com/mobile/20170305/20170305114319_d0d1113aff272ad325c1b2d200b99721_3_mwpm_03200403.jpeg"},{"uniquekey":"f83d2991767f52c9bc0250b464e18570","title":"家中5000元不翼而飞 夫妇报警后丈夫被拘留","date":"2017-03-05 11:43","category":"头条","author_name":"大浙网","url":"http://mini.eastday.com/mobile/170305114319026.html","thumbnail_pic_s":"http://05.imgmini.eastday.com/mobile/20170305/20170305114319_5f3d08e5fdaaa3fcff1b8d45f8540415_1_mwpm_03200403.jpeg"}]
         */

        private String stat;
        private List<DataBean> data;

        public String getStat() {
            return stat;
        }

        public void setStat(String stat) {
            this.stat = stat;
        }

        public List<DataBean> getData() {
            return data;
        }

        public void setData(List<DataBean> data) {
            this.data = data;
        }

        public static class DataBean {
            /**
             * uniquekey : 5dcfab106cf77e1741b57bfadacd3d12
             * title : 六旬老妇遭儿子暴打 11根肋骨断裂左耳膜穿孔
             * date : 2017-03-05 13:30
             * category : 头条
             * author_name : 江苏电视台
             * url : http://mini.eastday.com/mobile/170305133038448.html
             * thumbnail_pic_s : http://08.imgmini.eastday.com/mobile/20170305/20170305133038_244ade3f757f57672ca305f9692f6a35_1_mwpm_03200403.jpeg
             * thumbnail_pic_s02 : http://08.imgmini.eastday.com/mobile/20170305/20170305133038_244ade3f757f57672ca305f9692f6a35_2_mwpm_03200403.jpeg
             * thumbnail_pic_s03 : http://08.imgmini.eastday.com/mobile/20170305/20170305133038_244ade3f757f57672ca305f9692f6a35_3_mwpm_03200403.jpeg
             */

            private String uniquekey;
            private String title;
            private String date;
            private String category;
            private String author_name;
            private String url;
            private String thumbnail_pic_s;
            private String thumbnail_pic_s02;
            private String thumbnail_pic_s03;

            public String getUniquekey() {
                return uniquekey;
            }

            public void setUniquekey(String uniquekey) {
                this.uniquekey = uniquekey;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public String getCategory() {
                return category;
            }

            public void setCategory(String category) {
                this.category = category;
            }

            public String getAuthor_name() {
                return author_name;
            }

            public void setAuthor_name(String author_name) {
                this.author_name = author_name;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public String getThumbnail_pic_s() {
                return thumbnail_pic_s;
            }

            public void setThumbnail_pic_s(String thumbnail_pic_s) {
                this.thumbnail_pic_s = thumbnail_pic_s;
            }

            public String getThumbnail_pic_s02() {
                return thumbnail_pic_s02;
            }

            public void setThumbnail_pic_s02(String thumbnail_pic_s02) {
                this.thumbnail_pic_s02 = thumbnail_pic_s02;
            }

            public String getThumbnail_pic_s03() {
                return thumbnail_pic_s03;
            }

            public void setThumbnail_pic_s03(String thumbnail_pic_s03) {
                this.thumbnail_pic_s03 = thumbnail_pic_s03;
            }
        }
    }
}
