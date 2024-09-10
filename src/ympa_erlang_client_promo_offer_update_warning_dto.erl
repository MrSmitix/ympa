-module(ympa_erlang_client_promo_offer_update_warning_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_promo_offer_update_warning_dto/0]).

-type ympa_erlang_client_promo_offer_update_warning_dto() ::
    #{ 'code' := ympa_erlang_client_promo_offer_update_warning_code_type:ympa_erlang_client_promo_offer_update_warning_code_type(),
       'campaignIds' => list()
     }.

encode(#{ 'code' := Code,
          'campaignIds' := CampaignIds
        }) ->
    #{ 'code' => Code,
       'campaignIds' => CampaignIds
     }.
