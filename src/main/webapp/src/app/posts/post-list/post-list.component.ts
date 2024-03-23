import { Component } from '@angular/core';
import { Post } from "../post";
import { PostService } from '../post.service';

@Component({
  selector: 'app-post-list',
  standalone: true,
  imports: [],
  templateUrl: './post-list.component.html',
  styleUrl: './post-list.component.css'
})

export class PostListComponent {
	
	constructor(private postService: PostService) { }
	
	posts: Post[] = [];
	
	getPosts(): void {
		this.postService.getAll().subscribe({
			next: (data) => {
				this.posts = data;
				//this.posts.sort((a, b) => new Date(b.timePosted).getTime() - new Date(a.timePosted).getTime());
			}
		});
	}
	
	
	ngOnInit(): void {
		this.getPosts();
		this.postService.onPostAdded.subscribe(
			(data: Post) => this.posts.push(data)
		);
	}
	
	
}
