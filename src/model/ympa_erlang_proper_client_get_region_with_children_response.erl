-module(ympa_erlang_proper_client_get_region_with_children_response).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_get_region_with_children_response/0]).

-export([ympa_erlang_proper_client_get_region_with_children_response/1]).

-export_type([ympa_erlang_proper_client_get_region_with_children_response/0]).

-type ympa_erlang_proper_client_get_region_with_children_response() ::
  [ {'pager', ympa_erlang_proper_client_flipping_pager_dto:ympa_erlang_proper_client_flipping_pager_dto() }
  | {'regions', ympa_erlang_proper_client_region_dto:ympa_erlang_proper_client_region_dto() }
  ].


ympa_erlang_proper_client_get_region_with_children_response() ->
    ympa_erlang_proper_client_get_region_with_children_response([]).

ympa_erlang_proper_client_get_region_with_children_response(Fields) ->
  Default = [ {'pager', ympa_erlang_proper_client_flipping_pager_dto:ympa_erlang_proper_client_flipping_pager_dto() }
            , {'regions', ympa_erlang_proper_client_region_dto:ympa_erlang_proper_client_region_dto() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

