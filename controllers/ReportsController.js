/**
 * The ReportsController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/ReportsService');
const generateBoostConsolidatedReport = async (request, response) => {
  await Controller.handleRequest(request, response, service.generateBoostConsolidatedReport);
};

const generateCompetitorsPositionReport = async (request, response) => {
  await Controller.handleRequest(request, response, service.generateCompetitorsPositionReport);
};

const generateGoodsFeedbackReport = async (request, response) => {
  await Controller.handleRequest(request, response, service.generateGoodsFeedbackReport);
};

const generateGoodsMovementReport = async (request, response) => {
  await Controller.handleRequest(request, response, service.generateGoodsMovementReport);
};

const generateGoodsRealizationReport = async (request, response) => {
  await Controller.handleRequest(request, response, service.generateGoodsRealizationReport);
};

const generateGoodsTurnoverReport = async (request, response) => {
  await Controller.handleRequest(request, response, service.generateGoodsTurnoverReport);
};

const generateMassOrderLabelsReport = async (request, response) => {
  await Controller.handleRequest(request, response, service.generateMassOrderLabelsReport);
};

const generatePricesReport = async (request, response) => {
  await Controller.handleRequest(request, response, service.generatePricesReport);
};

const generateShelfsStatisticsReport = async (request, response) => {
  await Controller.handleRequest(request, response, service.generateShelfsStatisticsReport);
};

const generateShipmentListDocumentReport = async (request, response) => {
  await Controller.handleRequest(request, response, service.generateShipmentListDocumentReport);
};

const generateShowsSalesReport = async (request, response) => {
  await Controller.handleRequest(request, response, service.generateShowsSalesReport);
};

const generateStocksOnWarehousesReport = async (request, response) => {
  await Controller.handleRequest(request, response, service.generateStocksOnWarehousesReport);
};

const generateUnitedMarketplaceServicesReport = async (request, response) => {
  await Controller.handleRequest(request, response, service.generateUnitedMarketplaceServicesReport);
};

const generateUnitedNettingReport = async (request, response) => {
  await Controller.handleRequest(request, response, service.generateUnitedNettingReport);
};

const generateUnitedOrdersReport = async (request, response) => {
  await Controller.handleRequest(request, response, service.generateUnitedOrdersReport);
};

const getReportInfo = async (request, response) => {
  await Controller.handleRequest(request, response, service.getReportInfo);
};


module.exports = {
  generateBoostConsolidatedReport,
  generateCompetitorsPositionReport,
  generateGoodsFeedbackReport,
  generateGoodsMovementReport,
  generateGoodsRealizationReport,
  generateGoodsTurnoverReport,
  generateMassOrderLabelsReport,
  generatePricesReport,
  generateShelfsStatisticsReport,
  generateShipmentListDocumentReport,
  generateShowsSalesReport,
  generateStocksOnWarehousesReport,
  generateUnitedMarketplaceServicesReport,
  generateUnitedNettingReport,
  generateUnitedOrdersReport,
  getReportInfo,
};
