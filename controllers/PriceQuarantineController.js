/**
 * The PriceQuarantineController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/PriceQuarantineService');
const confirmBusinessPrices = async (request, response) => {
  await Controller.handleRequest(request, response, service.confirmBusinessPrices);
};

const confirmCampaignPrices = async (request, response) => {
  await Controller.handleRequest(request, response, service.confirmCampaignPrices);
};

const getBusinessQuarantineOffers = async (request, response) => {
  await Controller.handleRequest(request, response, service.getBusinessQuarantineOffers);
};

const getCampaignQuarantineOffers = async (request, response) => {
  await Controller.handleRequest(request, response, service.getCampaignQuarantineOffers);
};


module.exports = {
  confirmBusinessPrices,
  confirmCampaignPrices,
  getBusinessQuarantineOffers,
  getCampaignQuarantineOffers,
};
