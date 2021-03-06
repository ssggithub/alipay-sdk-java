package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.fastpay.refund.query response.
 * 
 * @author auto create
 * @since 1.0, 2017-09-28 19:04:35
 */
public class AlipayTradeFastpayRefundQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4776974585314738131L;

	/** 
	 * 行业特殊信息（例如在医保卡支付退款中，医保局向商户返回医疗信息）。
	 */
	@ApiField("industry_sepc_detail")
	private String industrySepcDetail;

	/** 
	 * 本笔退款对应的退款请求号
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/** 
	 * 创建交易传入的商户订单号
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/** 
	 * 本次退款请求，对应的退款金额
	 */
	@ApiField("refund_amount")
	private String refundAmount;

	/** 
	 * 发起退款时，传入的退款原因
	 */
	@ApiField("refund_reason")
	private String refundReason;

	/** 
	 * 该笔退款所对应的交易的订单金额
	 */
	@ApiField("total_amount")
	private String totalAmount;

	/** 
	 * 支付宝交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public void setIndustrySepcDetail(String industrySepcDetail) {
		this.industrySepcDetail = industrySepcDetail;
	}
	public String getIndustrySepcDetail( ) {
		return this.industrySepcDetail;
	}

	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}
	public String getOutRequestNo( ) {
		return this.outRequestNo;
	}

	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}
	public String getOutTradeNo( ) {
		return this.outTradeNo;
	}

	public void setRefundAmount(String refundAmount) {
		this.refundAmount = refundAmount;
	}
	public String getRefundAmount( ) {
		return this.refundAmount;
	}

	public void setRefundReason(String refundReason) {
		this.refundReason = refundReason;
	}
	public String getRefundReason( ) {
		return this.refundReason;
	}

	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}
	public String getTotalAmount( ) {
		return this.totalAmount;
	}

	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	public String getTradeNo( ) {
		return this.tradeNo;
	}

}
