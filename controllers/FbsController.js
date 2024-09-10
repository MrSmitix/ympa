/**
 * The FbsController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/FbsService');
const addHiddenOffers = async (request, response) => {
  await Controller.handleRequest(request, response, service.addHiddenOffers);
};

const addOffersToArchive = async (request, response) => {
  await Controller.handleRequest(request, response, service.addOffersToArchive);
};

const calculateTariffs = async (request, response) => {
  await Controller.handleRequest(request, response, service.calculateTariffs);
};

const confirmBusinessPrices = async (request, response) => {
  await Controller.handleRequest(request, response, service.confirmBusinessPrices);
};

const confirmCampaignPrices = async (request, response) => {
  await Controller.handleRequest(request, response, service.confirmCampaignPrices);
};

const confirmShipment = async (request, response) => {
  await Controller.handleRequest(request, response, service.confirmShipment);
};

const createChat = async (request, response) => {
  await Controller.handleRequest(request, response, service.createChat);
};

const deleteCampaignOffers = async (request, response) => {
  await Controller.handleRequest(request, response, service.deleteCampaignOffers);
};

const deleteGoodsFeedbackComment = async (request, response) => {
  await Controller.handleRequest(request, response, service.deleteGoodsFeedbackComment);
};

const deleteHiddenOffers = async (request, response) => {
  await Controller.handleRequest(request, response, service.deleteHiddenOffers);
};

const deleteOffers = async (request, response) => {
  await Controller.handleRequest(request, response, service.deleteOffers);
};

const deleteOffersFromArchive = async (request, response) => {
  await Controller.handleRequest(request, response, service.deleteOffersFromArchive);
};

const deletePromoOffers = async (request, response) => {
  await Controller.handleRequest(request, response, service.deletePromoOffers);
};

const downloadShipmentAct = async (request, response) => {
  await Controller.handleRequest(request, response, service.downloadShipmentAct);
};

const downloadShipmentDiscrepancyAct = async (request, response) => {
  await Controller.handleRequest(request, response, service.downloadShipmentDiscrepancyAct);
};

const downloadShipmentInboundAct = async (request, response) => {
  await Controller.handleRequest(request, response, service.downloadShipmentInboundAct);
};

const downloadShipmentPalletLabels = async (request, response) => {
  await Controller.handleRequest(request, response, service.downloadShipmentPalletLabels);
};

const downloadShipmentReceptionTransferAct = async (request, response) => {
  await Controller.handleRequest(request, response, service.downloadShipmentReceptionTransferAct);
};

const downloadShipmentTransportationWaybill = async (request, response) => {
  await Controller.handleRequest(request, response, service.downloadShipmentTransportationWaybill);
};

const generateBoostConsolidatedReport = async (request, response) => {
  await Controller.handleRequest(request, response, service.generateBoostConsolidatedReport);
};

const generateCompetitorsPositionReport = async (request, response) => {
  await Controller.handleRequest(request, response, service.generateCompetitorsPositionReport);
};

const generateGoodsFeedbackReport = async (request, response) => {
  await Controller.handleRequest(request, response, service.generateGoodsFeedbackReport);
};

const generateGoodsRealizationReport = async (request, response) => {
  await Controller.handleRequest(request, response, service.generateGoodsRealizationReport);
};

const generateMassOrderLabelsReport = async (request, response) => {
  await Controller.handleRequest(request, response, service.generateMassOrderLabelsReport);
};

const generateOrderLabel = async (request, response) => {
  await Controller.handleRequest(request, response, service.generateOrderLabel);
};

const generateOrderLabels = async (request, response) => {
  await Controller.handleRequest(request, response, service.generateOrderLabels);
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

const getAllOffers = async (request, response) => {
  await Controller.handleRequest(request, response, service.getAllOffers);
};

const getBidsInfoForBusiness = async (request, response) => {
  await Controller.handleRequest(request, response, service.getBidsInfoForBusiness);
};

const getBidsRecommendations = async (request, response) => {
  await Controller.handleRequest(request, response, service.getBidsRecommendations);
};

const getBusinessQuarantineOffers = async (request, response) => {
  await Controller.handleRequest(request, response, service.getBusinessQuarantineOffers);
};

const getBusinessSettings = async (request, response) => {
  await Controller.handleRequest(request, response, service.getBusinessSettings);
};

const getCampaign = async (request, response) => {
  await Controller.handleRequest(request, response, service.getCampaign);
};

const getCampaignLogins = async (request, response) => {
  await Controller.handleRequest(request, response, service.getCampaignLogins);
};

const getCampaignOffers = async (request, response) => {
  await Controller.handleRequest(request, response, service.getCampaignOffers);
};

const getCampaignQuarantineOffers = async (request, response) => {
  await Controller.handleRequest(request, response, service.getCampaignQuarantineOffers);
};

const getCampaignRegion = async (request, response) => {
  await Controller.handleRequest(request, response, service.getCampaignRegion);
};

const getCampaignSettings = async (request, response) => {
  await Controller.handleRequest(request, response, service.getCampaignSettings);
};

const getCampaigns = async (request, response) => {
  await Controller.handleRequest(request, response, service.getCampaigns);
};

const getCampaignsByLogin = async (request, response) => {
  await Controller.handleRequest(request, response, service.getCampaignsByLogin);
};

const getCategoriesMaxSaleQuantum = async (request, response) => {
  await Controller.handleRequest(request, response, service.getCategoriesMaxSaleQuantum);
};

const getCategoriesTree = async (request, response) => {
  await Controller.handleRequest(request, response, service.getCategoriesTree);
};

const getCategoryContentParameters = async (request, response) => {
  await Controller.handleRequest(request, response, service.getCategoryContentParameters);
};

const getChatHistory = async (request, response) => {
  await Controller.handleRequest(request, response, service.getChatHistory);
};

const getChats = async (request, response) => {
  await Controller.handleRequest(request, response, service.getChats);
};

const getDeliveryServices = async (request, response) => {
  await Controller.handleRequest(request, response, service.getDeliveryServices);
};

const getFeed = async (request, response) => {
  await Controller.handleRequest(request, response, service.getFeed);
};

const getFeedIndexLogs = async (request, response) => {
  await Controller.handleRequest(request, response, service.getFeedIndexLogs);
};

const getFeedbackAndCommentUpdates = async (request, response) => {
  await Controller.handleRequest(request, response, service.getFeedbackAndCommentUpdates);
};

const getFeeds = async (request, response) => {
  await Controller.handleRequest(request, response, service.getFeeds);
};

const getGoodsFeedbackComments = async (request, response) => {
  await Controller.handleRequest(request, response, service.getGoodsFeedbackComments);
};

const getGoodsFeedbacks = async (request, response) => {
  await Controller.handleRequest(request, response, service.getGoodsFeedbacks);
};

const getGoodsStats = async (request, response) => {
  await Controller.handleRequest(request, response, service.getGoodsStats);
};

const getHiddenOffers = async (request, response) => {
  await Controller.handleRequest(request, response, service.getHiddenOffers);
};

const getOfferCardsContentStatus = async (request, response) => {
  await Controller.handleRequest(request, response, service.getOfferCardsContentStatus);
};

const getOfferMappingEntries = async (request, response) => {
  await Controller.handleRequest(request, response, service.getOfferMappingEntries);
};

const getOfferMappings = async (request, response) => {
  await Controller.handleRequest(request, response, service.getOfferMappings);
};

const getOfferRecommendations = async (request, response) => {
  await Controller.handleRequest(request, response, service.getOfferRecommendations);
};

const getOffers = async (request, response) => {
  await Controller.handleRequest(request, response, service.getOffers);
};

const getOrder = async (request, response) => {
  await Controller.handleRequest(request, response, service.getOrder);
};

const getOrderBusinessBuyerInfo = async (request, response) => {
  await Controller.handleRequest(request, response, service.getOrderBusinessBuyerInfo);
};

const getOrderBusinessDocumentsInfo = async (request, response) => {
  await Controller.handleRequest(request, response, service.getOrderBusinessDocumentsInfo);
};

const getOrderLabelsData = async (request, response) => {
  await Controller.handleRequest(request, response, service.getOrderLabelsData);
};

const getOrders = async (request, response) => {
  await Controller.handleRequest(request, response, service.getOrders);
};

const getOrdersStats = async (request, response) => {
  await Controller.handleRequest(request, response, service.getOrdersStats);
};

const getPrices = async (request, response) => {
  await Controller.handleRequest(request, response, service.getPrices);
};

const getPricesByOfferIds = async (request, response) => {
  await Controller.handleRequest(request, response, service.getPricesByOfferIds);
};

const getPromoOffers = async (request, response) => {
  await Controller.handleRequest(request, response, service.getPromoOffers);
};

const getPromos = async (request, response) => {
  await Controller.handleRequest(request, response, service.getPromos);
};

const getQualityRatingDetails = async (request, response) => {
  await Controller.handleRequest(request, response, service.getQualityRatingDetails);
};

const getQualityRatings = async (request, response) => {
  await Controller.handleRequest(request, response, service.getQualityRatings);
};

const getReportInfo = async (request, response) => {
  await Controller.handleRequest(request, response, service.getReportInfo);
};

const getReturn = async (request, response) => {
  await Controller.handleRequest(request, response, service.getReturn);
};

const getReturnApplication = async (request, response) => {
  await Controller.handleRequest(request, response, service.getReturnApplication);
};

const getReturnPhoto = async (request, response) => {
  await Controller.handleRequest(request, response, service.getReturnPhoto);
};

const getReturns = async (request, response) => {
  await Controller.handleRequest(request, response, service.getReturns);
};

const getShipment = async (request, response) => {
  await Controller.handleRequest(request, response, service.getShipment);
};

const getShipmentOrdersInfo = async (request, response) => {
  await Controller.handleRequest(request, response, service.getShipmentOrdersInfo);
};

const getStocks = async (request, response) => {
  await Controller.handleRequest(request, response, service.getStocks);
};

const getSuggestedOfferMappingEntries = async (request, response) => {
  await Controller.handleRequest(request, response, service.getSuggestedOfferMappingEntries);
};

const getSuggestedOfferMappings = async (request, response) => {
  await Controller.handleRequest(request, response, service.getSuggestedOfferMappings);
};

const getSuggestedPrices = async (request, response) => {
  await Controller.handleRequest(request, response, service.getSuggestedPrices);
};

const getWarehouses = async (request, response) => {
  await Controller.handleRequest(request, response, service.getWarehouses);
};

const provideOrderItemIdentifiers = async (request, response) => {
  await Controller.handleRequest(request, response, service.provideOrderItemIdentifiers);
};

const putBidsForBusiness = async (request, response) => {
  await Controller.handleRequest(request, response, service.putBidsForBusiness);
};

const putBidsForCampaign = async (request, response) => {
  await Controller.handleRequest(request, response, service.putBidsForCampaign);
};

const refreshFeed = async (request, response) => {
  await Controller.handleRequest(request, response, service.refreshFeed);
};

const searchRegionChildren = async (request, response) => {
  await Controller.handleRequest(request, response, service.searchRegionChildren);
};

const searchRegionsById = async (request, response) => {
  await Controller.handleRequest(request, response, service.searchRegionsById);
};

const searchRegionsByName = async (request, response) => {
  await Controller.handleRequest(request, response, service.searchRegionsByName);
};

const searchShipments = async (request, response) => {
  await Controller.handleRequest(request, response, service.searchShipments);
};

const sendFileToChat = async (request, response) => {
  await Controller.handleRequest(request, response, service.sendFileToChat);
};

const sendMessageToChat = async (request, response) => {
  await Controller.handleRequest(request, response, service.sendMessageToChat);
};

const setFeedParams = async (request, response) => {
  await Controller.handleRequest(request, response, service.setFeedParams);
};

const setOrderBoxLayout = async (request, response) => {
  await Controller.handleRequest(request, response, service.setOrderBoxLayout);
};

const setOrderShipmentBoxes = async (request, response) => {
  await Controller.handleRequest(request, response, service.setOrderShipmentBoxes);
};

const setShipmentPalletsCount = async (request, response) => {
  await Controller.handleRequest(request, response, service.setShipmentPalletsCount);
};

const skipGoodsFeedbacksReaction = async (request, response) => {
  await Controller.handleRequest(request, response, service.skipGoodsFeedbacksReaction);
};

const transferOrdersFromShipment = async (request, response) => {
  await Controller.handleRequest(request, response, service.transferOrdersFromShipment);
};

const updateBusinessPrices = async (request, response) => {
  await Controller.handleRequest(request, response, service.updateBusinessPrices);
};

const updateCampaignOffers = async (request, response) => {
  await Controller.handleRequest(request, response, service.updateCampaignOffers);
};

const updateGoodsFeedbackComment = async (request, response) => {
  await Controller.handleRequest(request, response, service.updateGoodsFeedbackComment);
};

const updateOfferContent = async (request, response) => {
  await Controller.handleRequest(request, response, service.updateOfferContent);
};

const updateOfferMappingEntries = async (request, response) => {
  await Controller.handleRequest(request, response, service.updateOfferMappingEntries);
};

const updateOfferMappings = async (request, response) => {
  await Controller.handleRequest(request, response, service.updateOfferMappings);
};

const updateOrderItems = async (request, response) => {
  await Controller.handleRequest(request, response, service.updateOrderItems);
};

const updateOrderStatus = async (request, response) => {
  await Controller.handleRequest(request, response, service.updateOrderStatus);
};

const updateOrderStatuses = async (request, response) => {
  await Controller.handleRequest(request, response, service.updateOrderStatuses);
};

const updatePrices = async (request, response) => {
  await Controller.handleRequest(request, response, service.updatePrices);
};

const updatePromoOffers = async (request, response) => {
  await Controller.handleRequest(request, response, service.updatePromoOffers);
};

const updateStocks = async (request, response) => {
  await Controller.handleRequest(request, response, service.updateStocks);
};


module.exports = {
  addHiddenOffers,
  addOffersToArchive,
  calculateTariffs,
  confirmBusinessPrices,
  confirmCampaignPrices,
  confirmShipment,
  createChat,
  deleteCampaignOffers,
  deleteGoodsFeedbackComment,
  deleteHiddenOffers,
  deleteOffers,
  deleteOffersFromArchive,
  deletePromoOffers,
  downloadShipmentAct,
  downloadShipmentDiscrepancyAct,
  downloadShipmentInboundAct,
  downloadShipmentPalletLabels,
  downloadShipmentReceptionTransferAct,
  downloadShipmentTransportationWaybill,
  generateBoostConsolidatedReport,
  generateCompetitorsPositionReport,
  generateGoodsFeedbackReport,
  generateGoodsRealizationReport,
  generateMassOrderLabelsReport,
  generateOrderLabel,
  generateOrderLabels,
  generatePricesReport,
  generateShelfsStatisticsReport,
  generateShipmentListDocumentReport,
  generateShowsSalesReport,
  generateStocksOnWarehousesReport,
  generateUnitedMarketplaceServicesReport,
  generateUnitedNettingReport,
  generateUnitedOrdersReport,
  getAllOffers,
  getBidsInfoForBusiness,
  getBidsRecommendations,
  getBusinessQuarantineOffers,
  getBusinessSettings,
  getCampaign,
  getCampaignLogins,
  getCampaignOffers,
  getCampaignQuarantineOffers,
  getCampaignRegion,
  getCampaignSettings,
  getCampaigns,
  getCampaignsByLogin,
  getCategoriesMaxSaleQuantum,
  getCategoriesTree,
  getCategoryContentParameters,
  getChatHistory,
  getChats,
  getDeliveryServices,
  getFeed,
  getFeedIndexLogs,
  getFeedbackAndCommentUpdates,
  getFeeds,
  getGoodsFeedbackComments,
  getGoodsFeedbacks,
  getGoodsStats,
  getHiddenOffers,
  getOfferCardsContentStatus,
  getOfferMappingEntries,
  getOfferMappings,
  getOfferRecommendations,
  getOffers,
  getOrder,
  getOrderBusinessBuyerInfo,
  getOrderBusinessDocumentsInfo,
  getOrderLabelsData,
  getOrders,
  getOrdersStats,
  getPrices,
  getPricesByOfferIds,
  getPromoOffers,
  getPromos,
  getQualityRatingDetails,
  getQualityRatings,
  getReportInfo,
  getReturn,
  getReturnApplication,
  getReturnPhoto,
  getReturns,
  getShipment,
  getShipmentOrdersInfo,
  getStocks,
  getSuggestedOfferMappingEntries,
  getSuggestedOfferMappings,
  getSuggestedPrices,
  getWarehouses,
  provideOrderItemIdentifiers,
  putBidsForBusiness,
  putBidsForCampaign,
  refreshFeed,
  searchRegionChildren,
  searchRegionsById,
  searchRegionsByName,
  searchShipments,
  sendFileToChat,
  sendMessageToChat,
  setFeedParams,
  setOrderBoxLayout,
  setOrderShipmentBoxes,
  setShipmentPalletsCount,
  skipGoodsFeedbacksReaction,
  transferOrdersFromShipment,
  updateBusinessPrices,
  updateCampaignOffers,
  updateGoodsFeedbackComment,
  updateOfferContent,
  updateOfferMappingEntries,
  updateOfferMappings,
  updateOrderItems,
  updateOrderStatus,
  updateOrderStatuses,
  updatePrices,
  updatePromoOffers,
  updateStocks,
};
