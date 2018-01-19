<%@ include file="common/header.jspf"%>
<%@ include file="common/navigation.jspf"%>

<div class="container">

	<div class="picshow_main row">
		<div class="sliderimg col-sm-3">
			<a id="url_theme"
				href="/watch-blurred-lines-inside-the-art-world-online-free-yify/">
				<div id="pic" class="imgbig"
					style="no-repeat center; padding-bottom: 39%; width: 100%; background-size: auto 100%;">
					<img
						style="width: 100%; display: block; float: center; padding: .75rem; border: 0;"
						src=${movie.getPosterUrl()	}
						class="img-responsive img-thumbnail rounded hoverable"
						data-holder-rendered="true">
					</div>
			</a>
		</div>
		<div class="ava_video_info col-sm-9">
			<div class="ava_video_info_top">
				<div class="ava_video_info_flow">
					<div>
						<h2>
							<a class="ava_video_info_title"
								href="/watch-blurred-lines-inside-the-art-world-online-free-yify/"
								rel="nofollow">${movie.getTitle()}<span
								class="ava_video_info_year"> (${movie.getYear()})</span></a>
						</h2>
						<div
							class="ava_video_info_element ava_video_info_soft ava_ellipsis">${movie.getDuration()} | <c:forEach var="genre" items="${movie.getGenres()}">${genre},</c:forEach></div>
					</div>
					<div class="ava_sinop">
						<div class="ava_video_info_element">${movie.getStoryLine() }</div>
					</div>
				</div>
			</div>
			<div class="ava_video_info_bottom hidden-xs">
				<div class="ava_video_info_element ava_ellipsis">Cast: <c:forEach var="actor" items="${movie.getActors()}">${actor}, </c:forEach></div>
			</div>
		</div>
	</div>
</div>

<%@ include file="common/footer.jspf"%>