/**
 * The PricesController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/PricesService');
const getPrices = async (request, response) => {
  await Controller.handleRequest(request, response, service.getPrices);
};

const getPricesByOfferIds = async (request, response) => {
  await Controller.handleRequest(request, response, service.getPricesByOfferIds);
};

const getSuggestedPrices = async (request, response) => {
  await Controller.handleRequest(request, response, service.getSuggestedPrices);
};

const updateBusinessPrices = async (request, response) => {
  await Controller.handleRequest(request, response, service.updateBusinessPrices);
};

const updatePrices = async (request, response) => {
  await Controller.handleRequest(request, response, service.updatePrices);
};


module.exports = {
  getPrices,
  getPricesByOfferIds,
  getSuggestedPrices,
  updateBusinessPrices,
  updatePrices,
};
