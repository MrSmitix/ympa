-module(ympa_erlang_proper_client_hidden_offer_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_hidden_offer_dto/0]).

-export([ympa_erlang_proper_client_hidden_offer_dto/1]).

-export_type([ympa_erlang_proper_client_hidden_offer_dto/0]).

-type ympa_erlang_proper_client_hidden_offer_dto() ::
  [ {'offerId', binary() }
  ].


ympa_erlang_proper_client_hidden_offer_dto() ->
    ympa_erlang_proper_client_hidden_offer_dto([]).

ympa_erlang_proper_client_hidden_offer_dto(Fields) ->
  Default = [ {'offerId', binary(1, 255) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

