-module(ympa_erlang_proper_client_flipping_pager_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_flipping_pager_dto/0]).

-export([ympa_erlang_proper_client_flipping_pager_dto/1]).

-export_type([ympa_erlang_proper_client_flipping_pager_dto/0]).

-type ympa_erlang_proper_client_flipping_pager_dto() ::
  [ {'total', integer() }
  | {'from', integer() }
  | {'to', integer() }
  | {'currentPage', integer() }
  | {'pagesCount', integer() }
  | {'pageSize', integer() }
  ].


ympa_erlang_proper_client_flipping_pager_dto() ->
    ympa_erlang_proper_client_flipping_pager_dto([]).

ympa_erlang_proper_client_flipping_pager_dto(Fields) ->
  Default = [ {'total', integer() }
            , {'from', integer() }
            , {'to', integer() }
            , {'currentPage', integer() }
            , {'pagesCount', integer() }
            , {'pageSize', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

