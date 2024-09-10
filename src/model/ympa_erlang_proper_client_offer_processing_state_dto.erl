-module(ympa_erlang_proper_client_offer_processing_state_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_offer_processing_state_dto/0]).

-export([ympa_erlang_proper_client_offer_processing_state_dto/1]).

-export_type([ympa_erlang_proper_client_offer_processing_state_dto/0]).

-type ympa_erlang_proper_client_offer_processing_state_dto() ::
  [ {'status', ympa_erlang_proper_client_offer_processing_status_type:ympa_erlang_proper_client_offer_processing_status_type() }
  | {'notes', list(ympa_erlang_proper_client_offer_processing_note_dto:ympa_erlang_proper_client_offer_processing_note_dto()) }
  ].


ympa_erlang_proper_client_offer_processing_state_dto() ->
    ympa_erlang_proper_client_offer_processing_state_dto([]).

ympa_erlang_proper_client_offer_processing_state_dto(Fields) ->
  Default = [ {'status', ympa_erlang_proper_client_offer_processing_status_type:ympa_erlang_proper_client_offer_processing_status_type() }
            , {'notes', list(ympa_erlang_proper_client_offer_processing_note_dto:ympa_erlang_proper_client_offer_processing_note_dto()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

