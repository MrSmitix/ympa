-module(ympa_erlang_client_generate_shipment_list_document_report_request).

-export([encode/1]).

-export_type([ympa_erlang_client_generate_shipment_list_document_report_request/0]).

-type ympa_erlang_client_generate_shipment_list_document_report_request() ::
    #{ 'campaignId' := integer(),
       'shipmentId' => integer(),
       'orderIds' => list()
     }.

encode(#{ 'campaignId' := CampaignId,
          'shipmentId' := ShipmentId,
          'orderIds' := OrderIds
        }) ->
    #{ 'campaignId' => CampaignId,
       'shipmentId' => ShipmentId,
       'orderIds' => OrderIds
     }.
