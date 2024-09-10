/**
 * The BidsController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/BidsService');
const getBidsInfoForBusiness = async (request, response) => {
  await Controller.handleRequest(request, response, service.getBidsInfoForBusiness);
};

const getBidsRecommendations = async (request, response) => {
  await Controller.handleRequest(request, response, service.getBidsRecommendations);
};

const putBidsForBusiness = async (request, response) => {
  await Controller.handleRequest(request, response, service.putBidsForBusiness);
};

const putBidsForCampaign = async (request, response) => {
  await Controller.handleRequest(request, response, service.putBidsForCampaign);
};


module.exports = {
  getBidsInfoForBusiness,
  getBidsRecommendations,
  putBidsForBusiness,
  putBidsForCampaign,
};
