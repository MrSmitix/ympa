-module(ympa_erlang_proper_client_offer_processing_note_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_offer_processing_note_dto/0]).

-export([ympa_erlang_proper_client_offer_processing_note_dto/1]).

-export_type([ympa_erlang_proper_client_offer_processing_note_dto/0]).

-type ympa_erlang_proper_client_offer_processing_note_dto() ::
  [ {'type', ympa_erlang_proper_client_offer_processing_note_type:ympa_erlang_proper_client_offer_processing_note_type() }
  | {'payload', binary() }
  ].


ympa_erlang_proper_client_offer_processing_note_dto() ->
    ympa_erlang_proper_client_offer_processing_note_dto([]).

ympa_erlang_proper_client_offer_processing_note_dto(Fields) ->
  Default = [ {'type', ympa_erlang_proper_client_offer_processing_note_type:ympa_erlang_proper_client_offer_processing_note_type() }
            , {'payload', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

