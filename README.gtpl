<p align="center"><img src="https://raw.githubusercontent.com/tejasholla/tejasholla/main/tejas-600px.png" /></p>

### GitHub Stats

<p align="left"><img src="https://raw.githubusercontent.com/tejasholla/tejasholla/main/github-metrics.svg" /></p>

### 👷 Check out what I'm currently working on
{{ range recentContributions 5 }}
- [{{ .Repo.Name }}]({{ .Repo.URL }}) - {{ .Repo.Description }}
{{- end }}
### 🌱 My latest projects
{{ range recentRepos 5 }}
- [{{ .Name }}]({{ .URL }}) - {{ .Description }}
{{- end }}
### 🔨 My recent Pull Requests
{{ range recentPullRequests 5 }}
- [{{ .Title }}]({{ .URL }}) on [{{ .Repo.Name }}]({{ .Repo.URL }})
{{- end }}
### ⭐ Recent Stars
{{ range recentStars 5 }}
- [{{ .Repo.Name }}]({{ .Repo.URL }}) - {{ .Repo.Description }}
{{- end }}
### 📰 Recent Blog Posts
{{ range rss "https://christitus.com/index.xml" 5 }}
- [{{ .Title }}]({{ .URL }})
{{- end }}
### 📫 How to reach me:
  - Youtube   : <https://youtube.com/c/ChrisTitusTech>
  - Twitter   : <https://twitter.com/christitustech>
  - Website   : <https://christitus.com>
