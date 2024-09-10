-module(ympa_erlang_proper_client_quality_rating_details_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_quality_rating_details_dto/0]).

-export([ympa_erlang_proper_client_quality_rating_details_dto/1]).

-export_type([ympa_erlang_proper_client_quality_rating_details_dto/0]).

-type ympa_erlang_proper_client_quality_rating_details_dto() ::
  [ {'affectedOrders', list(ympa_erlang_proper_client_quality_rating_affected_order_dto:ympa_erlang_proper_client_quality_rating_affected_order_dto()) }
  ].


ympa_erlang_proper_client_quality_rating_details_dto() ->
    ympa_erlang_proper_client_quality_rating_details_dto([]).

ympa_erlang_proper_client_quality_rating_details_dto(Fields) ->
  Default = [ {'affectedOrders', list(ympa_erlang_proper_client_quality_rating_affected_order_dto:ympa_erlang_proper_client_quality_rating_affected_order_dto()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

