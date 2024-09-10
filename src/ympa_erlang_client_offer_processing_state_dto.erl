-module(ympa_erlang_client_offer_processing_state_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_offer_processing_state_dto/0]).

-type ympa_erlang_client_offer_processing_state_dto() ::
    #{ 'status' => ympa_erlang_client_offer_processing_status_type:ympa_erlang_client_offer_processing_status_type(),
       'notes' => list()
     }.

encode(#{ 'status' := Status,
          'notes' := Notes
        }) ->
    #{ 'status' => Status,
       'notes' => Notes
     }.
