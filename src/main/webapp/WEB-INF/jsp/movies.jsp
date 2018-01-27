<%@ include file="common/header.jspf"%>
<%@ include file="common/navigation.jspf"%>
<div class="text-muted"
	style="min-height: 50rem; /* Can be removed; just added for demo purposes */ padding-top: 3rem; padding-bottom: 3rem; background-color: #f7f7f7;">
	<div class="container">
		<div class="row">
			<c:forEach var="movie" items="${movies}">

				<div class="card col-sm-3">
					<a href="/movies/movie/${movie.getId() }" class="thumbnail"> <img
						style="height: 280px; width: 100%; width: 224px; display: block; float: center; padding: .75rem; border: 0;"
						src=${movie.getPosterUrl()	}
						class="img-responsive img-thumbnail rounded hoverable"
						data-holder-rendered="true">
					</a>

					<p class="card-text" style="text-align: center; font-weight: bold">${movie.getTitle()}</p>
				</div>
			</c:forEach>
		</div>
	</div>
</div>
<%@ include file="common/footer.jspf"%>