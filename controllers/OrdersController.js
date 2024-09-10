/**
 * The OrdersController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/OrdersService');
const acceptOrderCancellation = async (request, response) => {
  await Controller.handleRequest(request, response, service.acceptOrderCancellation);
};

const getOrder = async (request, response) => {
  await Controller.handleRequest(request, response, service.getOrder);
};

const getOrders = async (request, response) => {
  await Controller.handleRequest(request, response, service.getOrders);
};

const provideOrderDigitalCodes = async (request, response) => {
  await Controller.handleRequest(request, response, service.provideOrderDigitalCodes);
};

const provideOrderItemIdentifiers = async (request, response) => {
  await Controller.handleRequest(request, response, service.provideOrderItemIdentifiers);
};

const setOrderBoxLayout = async (request, response) => {
  await Controller.handleRequest(request, response, service.setOrderBoxLayout);
};

const setOrderShipmentBoxes = async (request, response) => {
  await Controller.handleRequest(request, response, service.setOrderShipmentBoxes);
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


module.exports = {
  acceptOrderCancellation,
  getOrder,
  getOrders,
  provideOrderDigitalCodes,
  provideOrderItemIdentifiers,
  setOrderBoxLayout,
  setOrderShipmentBoxes,
  updateOrderItems,
  updateOrderStatus,
  updateOrderStatuses,
};
