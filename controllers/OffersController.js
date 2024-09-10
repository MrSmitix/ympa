/**
 * The OffersController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/OffersService');
const deleteCampaignOffers = async (request, response) => {
  await Controller.handleRequest(request, response, service.deleteCampaignOffers);
};

const getAllOffers = async (request, response) => {
  await Controller.handleRequest(request, response, service.getAllOffers);
};

const getCampaignOffers = async (request, response) => {
  await Controller.handleRequest(request, response, service.getCampaignOffers);
};

const getOfferRecommendations = async (request, response) => {
  await Controller.handleRequest(request, response, service.getOfferRecommendations);
};

const getOffers = async (request, response) => {
  await Controller.handleRequest(request, response, service.getOffers);
};

const updateCampaignOffers = async (request, response) => {
  await Controller.handleRequest(request, response, service.updateCampaignOffers);
};


module.exports = {
  deleteCampaignOffers,
  getAllOffers,
  getCampaignOffers,
  getOfferRecommendations,
  getOffers,
  updateCampaignOffers,
};
