-module(ympa_erlang_client_offer_condition_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_offer_condition_dto/0]).

-type ympa_erlang_client_offer_condition_dto() ::
    #{ 'type' => ympa_erlang_client_offer_condition_type:ympa_erlang_client_offer_condition_type(),
       'quality' => ympa_erlang_client_offer_condition_quality_type:ympa_erlang_client_offer_condition_quality_type(),
       'reason' => binary()
     }.

encode(#{ 'type' := Type,
          'quality' := Quality,
          'reason' := Reason
        }) ->
    #{ 'type' => Type,
       'quality' => Quality,
       'reason' => Reason
     }.
