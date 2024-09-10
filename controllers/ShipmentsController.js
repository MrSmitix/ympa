/**
 * The ShipmentsController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/ShipmentsService');
const confirmShipment = async (request, response) => {
  await Controller.handleRequest(request, response, service.confirmShipment);
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

const getShipment = async (request, response) => {
  await Controller.handleRequest(request, response, service.getShipment);
};

const getShipmentOrdersInfo = async (request, response) => {
  await Controller.handleRequest(request, response, service.getShipmentOrdersInfo);
};

const searchShipments = async (request, response) => {
  await Controller.handleRequest(request, response, service.searchShipments);
};

const setShipmentPalletsCount = async (request, response) => {
  await Controller.handleRequest(request, response, service.setShipmentPalletsCount);
};

const transferOrdersFromShipment = async (request, response) => {
  await Controller.handleRequest(request, response, service.transferOrdersFromShipment);
};


module.exports = {
  confirmShipment,
  downloadShipmentAct,
  downloadShipmentDiscrepancyAct,
  downloadShipmentInboundAct,
  downloadShipmentPalletLabels,
  downloadShipmentReceptionTransferAct,
  downloadShipmentTransportationWaybill,
  getShipment,
  getShipmentOrdersInfo,
  searchShipments,
  setShipmentPalletsCount,
  transferOrdersFromShipment,
};
