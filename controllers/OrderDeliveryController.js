/**
 * The OrderDeliveryController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/OrderDeliveryService');
const getOrderBuyerInfo = async (request, response) => {
  await Controller.handleRequest(request, response, service.getOrderBuyerInfo);
};

const setOrderDeliveryDate = async (request, response) => {
  await Controller.handleRequest(request, response, service.setOrderDeliveryDate);
};

const setOrderDeliveryTrackCode = async (request, response) => {
  await Controller.handleRequest(request, response, service.setOrderDeliveryTrackCode);
};

const updateOrderStorageLimit = async (request, response) => {
  await Controller.handleRequest(request, response, service.updateOrderStorageLimit);
};

const verifyOrderEac = async (request, response) => {
  await Controller.handleRequest(request, response, service.verifyOrderEac);
};


module.exports = {
  getOrderBuyerInfo,
  setOrderDeliveryDate,
  setOrderDeliveryTrackCode,
  updateOrderStorageLimit,
  verifyOrderEac,
};
