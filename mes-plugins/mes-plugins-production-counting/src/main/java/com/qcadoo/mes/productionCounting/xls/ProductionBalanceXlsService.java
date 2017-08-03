package com.qcadoo.mes.productionCounting.xls;

import java.util.Locale;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qcadoo.localization.api.TranslationService;
import com.qcadoo.model.api.Entity;
import com.qcadoo.report.api.xls.XlsDocumentService;

@Service
public class ProductionBalanceXlsService extends XlsDocumentService {

    @Autowired
    private TranslationService translationService;

    @Override
    protected void addHeader(HSSFSheet sheet, Locale locale, Entity entity) {

    }

    @Override
    protected void addSeries(HSSFSheet sheet, Entity productionBalance) {
        createProducedQuantitiesSheet(sheet);
    }

    @Override
    public String getReportTitle(Locale locale) {
        return translationService.translate("productionCounting.productionBalance.report.xls.sheet.producedQuantities", locale);
    }

    @Override
    protected void addExtraSheets(final HSSFWorkbook workbook) {
        createProductionCostsSheet(createSheet(workbook, "..."));
    }

    private void createProducedQuantitiesSheet(HSSFSheet sheet) {
    }

    private void createProductionCostsSheet(HSSFSheet sheet) {
    }
}