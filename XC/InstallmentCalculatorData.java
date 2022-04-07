/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pkfk.xmodel.other;

import com.pkfk.core.exceptions.CRUDCheckInException;
import com.pkfk.core.model.Filter;
import com.pkfk.core.model.Model;
import com.pkfk.core.otherobject.OtherObject;
import com.pkfk.core.user.User;
import com.pkfk.core.utils.ValuesMap;
import com.pkfk.template.ObjectRender;
import com.pkfk.xmodel.CreditCase;
import com.pkfk.xmodel.RestructCalculateData;
import com.pkfk.template.XTemplate;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
/**
 *
 * @author ivan.markin
 */
public class InstallmentCalculatorData extends OtherObject {

    private String _deferredPaymentTypeId;          //Тип рассрочки
    private Date _createDate;                       //Дата создания записи
    private Long _creditCaseId;                     //ИД договора
    private Short _paymentDate;                     //День платежа
    private BigDecimal _paymentAmount;              //Сумма платежа
    private Short _paymentTerm;                     //Срок
    private BigDecimal _paidLastAmount;             //Сумма последнего платежа
    private Date _paidLastDate;                     //Дата последнего платежа
    private Date _termDate;                         //Дата договоренности
    private String _flag;                           //Флаг
    private String _createUserId;                   //Кем создано
    private Date _sentToTricardDate;                //Дата передачи в 3-Card
    private Date _receivedFromTricardDate;          //Дата получения из 3-Card

    public String getDeferredPaymentTypeId() {
        return _deferredPaymentTypeId;
    }

    public Date getCreateDate() {
        return _createDate;
    }

    public Long getCreditCaseId() {
        return _creditCaseId;
    }

    public Short getPaymentDate() {
        return _paymentDate;
    }

    public BigDecimal getPaymentAmount() {
        return _paymentAmount;
    }

    public Short getPaymentTerm() {
        return _paymentTerm;
    }

    public BigDecimal getPaidLastAmount() {
        return _paidLastAmount;
    }

    public Date getPaidLastDate() {
        return _paidLastDate;
    }

    public Date getTermDate() {
        return _termDate;
    }

    public String getFlag() {
        return _flag;
    }

    public String getCreateUserId() {
        return _createUserId;
    }

    public Date getSentToTricardDate() {
        return _sentToTricardDate;
    }

    public Date getReceivedFromTricardDate() {
        return _receivedFromTricardDate;
    }

    public static void add(//Long id,
                           String deferredPaymentTypeId,
                           Date createDate,
                           CreditCase creditCase,
                           Short paymentDate,
                           BigDecimal paymentAmount,
                           Short paymentTerm,
                           String createUserId,
                           Date termDate) throws CRUDCheckInException {

        ValuesMap params = new ValuesMap()
                .putting("deferredPaymentTypeId", deferredPaymentTypeId)
                .putting("createDate", createDate)
                .putting("creditCaseId", creditCase.getId())
                .putting("paymentDate", paymentDate)
                .putting("paymentAmount", paymentAmount)
                .putting("paymentTerm", paymentTerm)
                .putting("paidLastAmount", null)
                .putting("paidLastDate", null)
                .putting("termDate", termDate)
                .putting("flag", null)
                .putting("createUserId", createUserId)
                .putting("sentToTricardDate", null)
                .putting("receivedFromTricardDate", null);

        Model.createObject(InstallmentCalculatorData.class, params);
    }


    public InstallmentCalculatorData getInstallmentCalculatorData() {
        return this;
    }

    /**
     * Получить все записи о Рассрочке, связанные с Кредитным Делом
     * @param cc Объект Кредитного Дела
     * @return Массив записей (по убыванию даты добавления)
     */
    public static List<InstallmentCalculatorData> getAllRowCurrentCase(CreditCase cc) {
        Filter f = new Filter();
        f.add("creditCaseId", cc.getId());
        f.addOrder("createDate", true, false);
        return Arrays.asList(Model.getObjects(InstallmentCalculatorData.class, f , null));
    }

    public static boolean hasHistory(CreditCase cc) {
        Long ccId = cc.getId();
        return (Model.getObjectCount(InstallmentCalculatorData.class, new Filter().add("creditCaseId",ccId).setLimit(1)) != 0 );
    }

    public static final ObjectRender<InstallmentCalculatorData> renderer = new InstallmentCalculatorDataRender();

    @Override
    public String render(String query) throws XTemplate.XTemplateRenderTime_Exception {
        try {
            return renderer.render(this, query);
        } catch (ObjectRender.NoSuchFieldException e) {
            return super.render(query);
        }
    }

}
